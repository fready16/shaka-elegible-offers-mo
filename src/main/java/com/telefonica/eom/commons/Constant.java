package com.telefonica.eom.commons;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: Constants.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Representa las variables necesarias en el flujo MOVIL. 
* 
*/
public class Constant {
	
	public static final String ASTERISK = "*";
	public static final String COMMA = ",";
	public static final String DOBLEPOINT = ":";
	public static final String X = "x";
	public static final String SPACE = " ";
	public static final String UNDERSCORE = "_";
	public static final String VOID_STRING = "";
	
	public static final String YES = "Y";
	public static final String NO = "N";
	
	public static final String RESIDENTIAL = "R";
	public static final String CORPORATE = "C";
	
	public static final String PLAN_GROUP = "Plan Group";
	public static final String PLAN_RANK = "Plan Rank";
	public static final String RNU = "RNU";
	
	public static final String HREF = "/offerings/";
	public static final String OFFER_PRICE_DESCRIPTION = "PRECIO DEL PLAN MOVIL";
	
	public static final String EASY_POST_PAYMENT = "postpagoFacil";
	public static final String EXEMPT_PENALTY = "exoneraPenalidad";
	
	public static final String COMPONENT_ID = "componentId";
	
	public static final String PREPAID = "prepaid";
	
	public static final String PROVIDE  = "PR";
	public static final String CHANGE = "CH";
	public static final String PORTABILITY = "PORT";
	public static final String ALTA = "ALTA";
	public static final String DEVICE_CHANGE = "CAEQ";
	public static final String REPLACE_OFFER = "RO";
	
	public static final String DURATION = "duration";
	public static final String WIRELESS = "WRLS";
	
	public static final String SVA = "SVA";
	public static final String SVA_PRICE = "Precio SVA";
	public static final String OC = "OC";
	public static final String PERUVIAN_COIN = "PEN";
	
	// Product Catalog Management Service - retrieveOfferings operation
	public static final String URL_OFFERINGS_SERVICE = "http://telefonica.com/globalIntegration/services/retrieveOfferings/v1";
	public static final String METHOD_OFFERINGS_SERVICE = "retrieveOfferingsRequest";
	
	// Penalty Service
	public static final String URL_PENALTY_SERVICE = "http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types";
	public static final String METHOD_PENALTY_SERVICE = "RetrieveCommitmentPenaltyRequest";
	
	//PARQUE UNIFICADO service
	public static final String PARQUE_UNIFICADO_URL = "http://10.4.43.105:880/products-0.0.1/products?";
	
	/**
	 * Gestión de Log y entornos.
	 */
	public static final String NEW_LINE = System.getProperty("line.separator");
	public static final String CLASS_LOG_LABEL = "[Class]: ";
	public static final String METHOD_LOG_LABEL = "[Method]: ";
	public static final String PARAMETERS_LOG_LABEL = "()";
	public static final String INPUT_PARAMETERS_LABEL = "[Input Params]: ";
	public static final String INPUT_PARAMETER_LABEL = "[Input]: ";
	public static final String OUTPUT_LABEL = "[Output Object]: ";
	public static final String SEPARATOR = "===================================================================================================================================================================================";

	public static final double IGV	     = 0.18;

	
	public static final String PARSE_JSON_RESPONSE    = "[No se pudo analizar el JSON del response del método (Verificar el Log)]";
	public static final String DEV_ENVIRONMENT	      = "dev";
	public static final String EXCEPTION_WAS_THROWN   = "-> An exception was thrown by method: ";
	public static final String DATE_TIME = "dd/MM/yy ' ' HH:mm:ss";
	    
	private Constant () {
	    
	}

}
