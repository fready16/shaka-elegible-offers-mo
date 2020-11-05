
package com.telefonica.eom.pojo.productinventory;

import java.util.HashMap;
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
* @FileName: Agreement.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto Agreement. 
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@referredType",
    "description",
    "entityType",
    "href",
    "id",
    "name",
    "role",
    "validFor"
})
@Data
public class Agreement {

    @JsonProperty("@referredType")
    public String referredType;
    @JsonProperty("description")
    public String description;
    @JsonProperty("entityType")
    public String entityType;
    @JsonProperty("href")
    public String href;
    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("role")
    public String role;
    @JsonProperty("validFor")
    public ValidFor validFor;
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
