
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
* @FileName: RelatedObject.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto RelatedObject. 
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "href",
    "involvement",
    "reference",
    "validFor"
})
@Data
public class RelatedObject {

    @JsonProperty("href")
    public String href;
    @JsonProperty("involvement")
    public String involvement;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("validFor")
    public ValidFor_____________ validFor;
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
