package com.telefonica.eom.pojo;

import lombok.Data;

/**
*
* @Author: Freddy Ipanaque Castillo
* @Datecreation: September 2020
* @FileName: PaginationInfo.java
* @AuthorCompany: Telefonica
* @version: 0.1
* @Description: Pojo del objeto PaginationInfo. 
*/
@Data
public class PaginationInfo {
	
    private Integer size;
    private Integer pageCount;
    private Integer page;
    private Integer maxResultCount;

}
