package com.telefonica.eom.pojo;

import java.math.BigDecimal;

import java.time.OffsetDateTime;

import lombok.Data;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: MobileElegibleOffersRequest.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto MobileElegibleOffersRequest. 
*/
@Data
public class MobileElegibleOffersRequest {
	
    private String type;
    private String correlationId;
    private String name;
    private Boolean isBundle;
    private String lifeCycleStatus;
    private Category category;
    private SubCategory subCategory;
    private String channelId;
    private String channelName;
    private ProductSpecification productSpecification;
    private String frameworkAgreeementId;
    private String customerId;
    private String accountId;
    private Product productObj;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private String limit;
    private String offset;
    private ProductOfferingPrice productOfferingPrice;
    private String fields;
    private Integer creditScore;
    private BigDecimal creditLimit;
    private String siteId;
    private String region;
    private String stateOrProvince;
    private Customer customer;
    private Boolean isPortability;
    private Portability portability;
    private String dealerId;
    private Broadband broadband;
    private Boolean isRetention;
    private String productOfferingCatalogId;
    private String currentOffering;
    private Boolean isUpgrade;
    private String action;
    private String commercialAreaId;
    private ProductOrder productOrder;
    private Plan plan;
    private String product;
    private String sourceType;
    private String networkTechnology;
    private Serviceability serviceability;
    private String invoiceCompany;
    private String orderSubType;
    private String subscriberGroupValue;
    private String excludeOffersId;
    private InstallationAddress installationAddress;
    private PaginationInfo paginationInfo;
    private String sortCriteriaName;
    private Boolean sortCriteriaAscending;

}
