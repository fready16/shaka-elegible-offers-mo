package com.telefonica.eom.pojo;

import java.time.LocalDate;

import lombok.Data;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: Portability.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto Portability. 
*/
@Data
public class Portability {
	
    private String currentPlanType;
    private LocalDate customerSince;
    private String currentCompany;

}
