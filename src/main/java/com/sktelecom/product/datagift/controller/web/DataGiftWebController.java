package com.sktelecom.product.datagift.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sktelecom.product.datagift.core.appication.dto.DataGiftRequestDTO;
import com.sktelecom.product.datagift.core.appication.dto.DataGiftResponseDTO;
import com.sktelecom.product.datagift.core.appication.port.DataGiftApplicationServicePort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController 
@RequestMapping("/v1/api/datagift")
public class DataGiftWebController {
	
	@Autowired
    DataGiftApplicationServicePort dataGiftApplicationService;
	
	@PostMapping("/list")
	public List<DataGiftResponseDTO> dataGiftCount(@RequestBody DataGiftRequestDTO dataGiftRequestDTO){
	    log.info("hello world!!");
	    return dataGiftApplicationService.getDataGiftSendHistory(dataGiftRequestDTO);
	}
}
