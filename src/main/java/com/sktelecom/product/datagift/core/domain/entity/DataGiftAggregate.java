package com.sktelecom.product.datagift.core.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ZORD_DATA_GIFT_HST")
public class DataGiftAggregate {
	@Id
	@Column(nullable = false, length = 10)
	private Integer svcMgmtNum;
	
	@Column(nullable = false, length = 14)
	private String opDtm;
	
	@Column(nullable = false, length = 10)
	private Integer befrSvcMgmtNum;
	
	@Column(nullable = false, length = 1)
	private String DataGiftOpStCd;
	
	@Column(nullable = false, length = 9)
	private String GiftDataQty;
	
	@Column(nullable = false, length = 10)
	private String opSaleOrgId;
	
	@Column(nullable = false, length = 10)
	private String OprId;
	
	@Column(nullable = true, length = 10)
	private String prodId;
	
	@Column(nullable = true, length = 10)
	private String befrProdId;
	
	@Column(nullable = true)
	private Integer custNum;
	
	@Column(nullable = true)
	private Integer befrCustNum;
	
	@Column(nullable = true, length = 4)
	private String giftIFRsltCd;

	@Column(nullable = true, length = 2)
	private String dataGiftTypCd;
	
	@Column(nullable = false, length = 1)
	private String afmlyGiftYn;
	
}
