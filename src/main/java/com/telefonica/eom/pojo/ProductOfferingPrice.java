package com.telefonica.eom.pojo;

import java.math.BigDecimal;

import java.time.OffsetDateTime;

import lombok.Data;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: ProductOfferingPrice.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto ProductOfferingPrice. 
*/
@Data
public class ProductOfferingPrice {
	
    private String priceUnits;
    private OffsetDateTime currencyChangeDate;
    private OffsetDateTime startPriceDate;
    private OffsetDateTime endPriceDate;
    private String priceConsumerEntityType;
    private String priceConsumerId;
    private String priceLocation;
    private BigDecimal startPriceAmout;
    private BigDecimal endPriceAmout;

}
