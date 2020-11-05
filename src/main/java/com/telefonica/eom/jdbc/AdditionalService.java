package com.telefonica.eom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.telefonica.eom.pojo.MobileElegibleOffersRequest;
import com.telefonica.eom.pojo.RelationsAdditionalServices;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: AdditionalService.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Clase Service que contiene los metodos necesarios para obtener la conexion JDBC  y lista de 
* 		RelationsAdditionalServices.
*/
@Service
public class AdditionalService {
    
	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String user;

	@Value("${spring.datasource.password}")
	String password;
 
    /**
    * Metodo que retorna una lista de RelationsAdditionalServices. 
    * @param MobileElegibleOffersRequest, List<String>
    * @return List<RelationsAdditionalServices>
    */
    public List<RelationsAdditionalServices> getRelations(MobileElegibleOffersRequest meor,
	    List<String> idComponentes) {

	List<RelationsAdditionalServices> rasList = new ArrayList<>();

	try (Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = this.getPreparedStatement(conn, meor, idComponentes);
		ResultSet rs = ps.executeQuery();
		) {

	    while (rs.next()) {
		rasList.add(new RelationsAdditionalServices(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
			rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),
			 rs.getString(11), rs.getString(12), rs.getString(13)));
	    }

	} catch (SQLException e) {
	    e.printStackTrace();
	}

	return rasList;
    }

    /**
    * Metodo auxiliar. 
    * @param Connection, MobileElegibleOffersRequest,List<String> 
    * @return PreparedStatement
    */
    private PreparedStatement getPreparedStatement(Connection conn, MobileElegibleOffersRequest meor, List<String> idComponentes)
	    throws SQLException {
	
	String query = "SELECT "
		+"bom.CID_BO, "
		+"bom.NAME_BO, "
		+"bom.CAPTION_BO, "
		+"rm.PARENT_ID, "
		+"rm.MINIMUM_QUANTITY, "
		+"rm.MAXIMUM_QUANTITY, "
		+"rm.DEFAULT_QUANTITY, "
		+"pibo.PROPERTY_VALUE, "
		+"pp.VALUE_ABP, "
		+"pp.REVENUE_TYPE, "
		+"rm.relation_id, " 
		+"sva.idcomponente, "
		+"rm.NAME_PARENT "
		+"FROM RE_DATA.RELATIONS_MASTER rm "
		+"INNER JOIN RE_DATA.BILLING_OFFER_MASTER bom ON rm.CHILD_ID = bom.CID_BO "
		+"INNER JOIN RE_DATA.PROPERTY_IN_BILLING_OFFER pibo ON rm.CHILD_ID = pibo.CID_BO "
		+"INNER JOIN RE_DATA.OFFER_FILTER_BO ofbo ON bom.CAPTION_BO = ofbo.BILLING_OFFER_CODE "
		+"INNER JOIN RE_DATA.PRICE_PROPERTIES pp ON bom.CID_BO = pp.BILLING_OFFER_CID "
		+"INNER JOIN re_data.svaoffering sva ON rm.parent_id = sva.idcomponente "
		+"WHERE "
		+"rm.ROOT_CID = '"+ meor.getProductOfferingCatalogId() +"' and " 
		+"rm.PARENT_ID IN ("+ this.fromListToString(idComponentes) +") and "
		+"rm.CHILD_IS = 'PP' and "
		+"rm.DEFAULT_QUANTITY = 0 and "
		+"rm.MINIMUM_QUANTITY = 0 and "
		+"rm.MAXIMUM_QUANTITY > 0 and "
		+"pibo.PROPERTY_NAME = 'Salesenddate' and " 
		+"ofbo.DEPARTMENT IN ('"+ meor.getRegion() +"', '*') and "
		+"ofbo.DEALER_CODE IN ('"+ meor.getDealerId() +"', '*') and "
		+"ofbo.STORE_ID IN ('"+ meor.getSiteId() +"', '*') and "
		+"ofbo.VALIDITY_START_DATE <= CURRENT_DATE and "
		+"ofbo.VALIDITY_END_DATE >= CURRENT_DATE and "
		+"pp.NAME_PROP_ABP = 'Rate' "
		+"order by sva.idcomponente asc";
	return conn.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
    }

    /**
    * Metodo auxiliar. 
    * @param List<String>
    * @return String
    */
    private String fromListToString(List<String> idComponentes) {
	StringBuilder str = new StringBuilder();
	
	if(!idComponentes.isEmpty()) {
	    idComponentes.forEach(idC -> str.append("'" + idC + "',"));
	    return str.substring(0, str.length() - 1);
	}
	return "' '";
    }

}
