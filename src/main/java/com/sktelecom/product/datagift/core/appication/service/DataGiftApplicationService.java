package com.sktelecom.product.datagift.core.appication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sktelecom.product.datagift.core.appication.dto.DataGiftRequestDTO;
import com.sktelecom.product.datagift.core.appication.dto.DataGiftResponseDTO;
import com.sktelecom.product.datagift.core.appication.port.DataGiftApplicationServicePort;

@Service
public class DataGiftApplicationService implements DataGiftApplicationServicePort {

	@Override
	public List<DataGiftResponseDTO> getDataGiftSendHistory(DataGiftRequestDTO dataGiftRequestDTO) {
		// TODO Auto-generated method stub
		List<DataGiftResponseDTO> dataGiftResponseDTO  = new ArrayList<DataGiftResponseDTO>(1);
		return dataGiftResponseDTO;
	}

}
