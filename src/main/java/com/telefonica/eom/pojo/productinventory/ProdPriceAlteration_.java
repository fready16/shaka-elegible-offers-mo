
package com.telefonica.eom.pojo.productinventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: ProdPriceAlteration_.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto ProdPriceAlteration_. 
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalData",
    "applicationDuration",
    "description",
    "discountType",
    "name",
    "price",
    "priceCondition",
    "priceType",
    "priority",
    "recurringChargePeriod",
    "unitOfMeasure",
    "validFor"
})
@Data
public class ProdPriceAlteration_ {

    @JsonProperty("additionalData")
    public List<AdditionalDatum_____> additionalData = null;
    @JsonProperty("applicationDuration")
    public Integer applicationDuration;
    @JsonProperty("description")
    public String description;
    @JsonProperty("discountType")
    public String discountType;
    @JsonProperty("name")
    public String name;
    @JsonProperty("price")
    public Price___ price;
    @JsonProperty("priceCondition")
    public String priceCondition;
    @JsonProperty("priceType")
    public String priceType;
    @JsonProperty("priority")
    public String priority;
    @JsonProperty("recurringChargePeriod")
    public String recurringChargePeriod;
    @JsonProperty("unitOfMeasure")
    public UnitOfMeasure__ unitOfMeasure;
    @JsonProperty("validFor")
    public ValidFor________ validFor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
