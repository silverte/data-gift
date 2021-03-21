package com.sktelecom.product.datagift.core.appication.port;

import java.util.List;
import com.sktelecom.product.datagift.core.appication.dto.DataGiftRequestDTO;
import com.sktelecom.product.datagift.core.appication.dto.DataGiftResponseDTO;

public interface DataGiftApplicationServicePort {
    List<DataGiftResponseDTO> getDataGiftSendHistory(DataGiftRequestDTO dataGiftRequestDTO);
}
