package com.telefonica.eom.pojo;

import lombok.Data;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: PUProduct.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto PUProduct. 
*/
@Data
public class PUProduct {
    
    private String publicId; 
    private String productType;
    private PUProductOffering productOffering;

}
