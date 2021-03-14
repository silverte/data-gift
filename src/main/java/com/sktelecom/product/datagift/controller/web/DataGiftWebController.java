package com.sktelecom.product.datagift.controller.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController 
@RequestMapping("/v1/api/rest")
public class DataGiftWebController {
	
	@GetMapping("harry")
	public String dataGiftCount(){
	   log.info("hello world!!");
	   log.debug("debug level!!");
		return new String("porter!");
	}
}
