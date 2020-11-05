package com.telefonica.eom.mapper;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.OffsetDateTime;

import com.telefonica.eom.pojo.Broadband;
import com.telefonica.eom.pojo.Category;
import com.telefonica.eom.pojo.Customer;
import com.telefonica.eom.pojo.InstallationAddress;
import com.telefonica.eom.pojo.MobileElegibleOffersRequest;
import com.telefonica.eom.pojo.PaginationInfo;
import com.telefonica.eom.pojo.Plan;
import com.telefonica.eom.pojo.Portability;
import com.telefonica.eom.pojo.Product;
import com.telefonica.eom.pojo.ProductOfferingPrice;
import com.telefonica.eom.pojo.ProductOrder;
import com.telefonica.eom.pojo.ProductSpecification;
import com.telefonica.eom.pojo.Serviceability;
import com.telefonica.eom.pojo.SubCategory;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: ApplicationRequestMapper.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Clase Service para generar objeto del request. 
* 
*/
@Service
public class ApplicationRequestMapper {

    public MobileElegibleOffersRequest fromParamstoBody(String type,String correlationId, String name, Boolean isBundle, String lifeCycleStatus,
	    String categoryId, String categoryName, String subcategoryId, String subcategoryName, String channelId, String channelName,
	    String productSpecificationId, String productSpecificationName, String frameworkAgreeementId, String customerId,
	    String accountId, String productType, String productId, String productPublicId, OffsetDateTime startDate,
	    OffsetDateTime endDate, String limit, String offset, String productOfferingPricePriceUnits,
	    OffsetDateTime productOfferingPriceCurrencyChangeDate, OffsetDateTime productOfferingPriceStartPriceDate,
	    OffsetDateTime productOfferingPriceEndPriceDate, String productOfferingPricePriceConsumerEntityType,
	    String productOfferingPricePriceConsumerId, String productOfferingPricePriceLocation,
	    BigDecimal productOfferingPriceStartPriceAmout, BigDecimal productOfferingPriceEndPriceAmout, String fields,
	    Integer creditScore, BigDecimal creditLimit, String region, String stateOrProvince, String customerSegment,
	    String customerSubsegment, Boolean isPortability, String portabilityCurrentPlanType, LocalDate portabilityCustomerSince,
	    String portabilityCurrentCompany, String dealerId, Integer broadbandMinDlDataRate, Integer broadbandMaxDlDataRate,
	    String broadbandConnection, Boolean isRetention, String productOfferingCatalogId, Boolean isUpgrade, String action,
	    String commercialAreaId, String siteId, String productOrderId, String planId, String product, String planGroup,
	    String planRankInitial, String planRank, String planCommitmentDuration, String currentOffering, String sourceType,
	    String networkTechnology, String serviceabilityMaxSpeed, String serviceabilityId, String invoiceCompany, String orderSubType,
	    String subscriberGroupValue, String excludeOffersId, String installationAddressDepartment, Integer paginationInfoSize,
	    Integer paginationInfoPageCount, Integer paginationInfoPage, Integer paginationInfoMaxResultCount, String sortCriteriaName,
	    Boolean sortCriteriaAscending) {

	MobileElegibleOffersRequest meor = new MobileElegibleOffersRequest();
	Category category = new Category();
	SubCategory subCategory = new SubCategory();
	ProductSpecification productSpecification = new ProductSpecification();
	Product productObj = new Product();
	ProductOfferingPrice pop = new ProductOfferingPrice();
	Customer customer = new Customer();
	Portability portability = new Portability();
	Broadband broadband = new Broadband();
	ProductOrder productOrder = new ProductOrder();
	Plan plan = new Plan();
	Serviceability serviceability = new Serviceability();
	InstallationAddress installationAddress = new InstallationAddress();
	PaginationInfo paginationInfo = new PaginationInfo();

	meor.setType(type);
	meor.setCorrelationId(correlationId);
	meor.setName(name);
	meor.setIsBundle(isBundle);
	meor.setLifeCycleStatus(lifeCycleStatus);
	category.setCategoryId(categoryId);
	category.setCategoryName(categoryName);
	meor.setCategory(category);
	subCategory.setSubcategoryId(subcategoryId);
	subCategory.setSubcategoryName(subcategoryName);
	meor.setSubCategory(subCategory);
	meor.setChannelId(channelId);
	meor.setChannelName(channelName);
	productSpecification.setProductSpecificationId(productSpecificationId);
	productSpecification.setProductSpecificationName(productSpecificationName);
	meor.setProductSpecification(productSpecification);
	meor.setFrameworkAgreeementId(frameworkAgreeementId);
	meor.setCustomerId(customerId);
	meor.setAccountId(accountId);
	productObj.setType(productType);
	productObj.setId(productId);
	productObj.setPublicId(productPublicId);
	meor.setProductObj(productObj);
	meor.setStartDate(startDate);
	meor.setEndDate(endDate);
	meor.setLimit(limit);
	meor.setOffset(offset);
	pop.setPriceUnits(productOfferingPricePriceUnits);
	pop.setCurrencyChangeDate(productOfferingPriceCurrencyChangeDate);
	pop.setStartPriceDate(productOfferingPriceStartPriceDate);
	pop.setEndPriceDate(productOfferingPriceEndPriceDate);
	pop.setPriceConsumerEntityType(productOfferingPricePriceConsumerEntityType);
	pop.setPriceConsumerId(productOfferingPricePriceConsumerId);
	pop.setPriceLocation(productOfferingPricePriceLocation);
	pop.setStartPriceAmout(productOfferingPriceStartPriceAmout);
	pop.setEndPriceAmout(productOfferingPriceEndPriceAmout);
	meor.setProductOfferingPrice(pop);
	meor.setFields(fields);
	meor.setCreditScore(creditScore);
	meor.setCreditLimit(creditLimit);
	meor.setSiteId(siteId);
	meor.setRegion(region);
	meor.setStateOrProvince(stateOrProvince);
	customer.setCustomerSegment(customerSegment);
	customer.setCustomerSubsegment(customerSubsegment);
	meor.setCustomer(customer);
	meor.setIsPortability(isPortability);
	portability.setCurrentPlanType(portabilityCurrentPlanType);
	portability.setCustomerSince(portabilityCustomerSince);
	portability.setCurrentCompany(portabilityCurrentCompany);
	meor.setPortability(portability);
	meor.setDealerId(dealerId);
	broadband.setMinDlDataRate(broadbandMinDlDataRate);
	broadband.setMaxDlDataRate(broadbandMaxDlDataRate);
	broadband.setConnection(broadbandConnection);
	meor.setBroadband(broadband);
	meor.setIsRetention(isRetention);
	meor.setProductOfferingCatalogId(productOfferingCatalogId);
	meor.setCurrentOffering(currentOffering);
	meor.setIsUpgrade(isUpgrade);
	meor.setAction(action);
	meor.setCommercialAreaId(commercialAreaId);
	productOrder.setProductOrderId(productOrderId);
	meor.setProductOrder(productOrder);
	plan.setId(planId);
	plan.setGroup(planGroup);
	plan.setRankInitial(planRankInitial);
	plan.setRank(planRank);
	plan.setCommitmentDuration(planCommitmentDuration);
	meor.setPlan(plan);
	meor.setProduct(product);
	meor.setSourceType(sourceType);
	meor.setNetworkTechnology(networkTechnology);
	serviceability.setServiceabilityMaxSpeed(serviceabilityMaxSpeed);
	serviceability.setServiceabilityId(serviceabilityId);
	meor.setServiceability(serviceability);
	meor.setInvoiceCompany(invoiceCompany);
	meor.setOrderSubType(orderSubType);
	meor.setSubscriberGroupValue(subscriberGroupValue);
	meor.setExcludeOffersId(excludeOffersId);
	installationAddress.setDepartment(installationAddressDepartment);
	meor.setInstallationAddress(installationAddress);
	paginationInfo.setSize(paginationInfoSize);
	paginationInfo.setPageCount(paginationInfoPageCount);
	paginationInfo.setPage(paginationInfoPage);
	paginationInfo.setMaxResultCount(paginationInfoMaxResultCount);
	meor.setPaginationInfo(paginationInfo);
	meor.setSortCriteriaName(sortCriteriaName);
	meor.setSortCriteriaAscending(sortCriteriaAscending);

	return meor;
    }

}
