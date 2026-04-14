package kg.megalab.comp_service.service;

import kg.megalab.comp_service.model.dto.ModelRamScreenDto;

import java.util.List;

public interface LaptopService {

    List<ModelRamScreenDto> findModelRamScreenDtosByPrice(double price);
}
