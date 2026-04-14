package kg.megalab.comp_service.service;

import kg.megalab.comp_service.model.dto.ModelSpeedHdDto;

import java.util.List;

public interface PcService {

    List<ModelSpeedHdDto> findModelSpeedHdDtosByPrice(double price);

}
