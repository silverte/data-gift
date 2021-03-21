package com.sktelecom.product.datagift.core.appication.dto;

import lombok.Setter;

@Setter
public class DataGiftResponseDTO {
	private Integer svcMgmtNum;
	private Integer befrSvcMgmtNum;
	private String DataGiftOpStCd;
	private String GiftDataQty;
	private String opSaleOrgId;
	private String OprId;
	private String prodId;
	private String befrProdId;
	private Integer custNum;
	private Integer befrCustNum;
	private String giftIFRsltCd;
	private String dataGiftTypCd;
	private String afmlyGiftYn; 
	
	DataGiftResponseDTO(Integer svcMgmtNum){
		this.svcMgmtNum = svcMgmtNum;
	}
}
