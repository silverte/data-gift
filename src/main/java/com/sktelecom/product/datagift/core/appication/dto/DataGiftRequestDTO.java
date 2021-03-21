package com.sktelecom.product.datagift.core.appication.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DataGiftRequestDTO {
	public Integer svcMgmtNum;
	public String  svcNum;
	public String  fromDate;
	public String  toDate;
}
