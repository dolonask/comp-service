package kg.megalab.comp_service.service.impl;

import kg.megalab.comp_service.model.Laptop;
import kg.megalab.comp_service.model.dto.ModelRamScreenDto;
import kg.megalab.comp_service.repo.LaptopRepo;
import kg.megalab.comp_service.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {
    @Autowired
    private LaptopRepo laptopRepo;

    @Override
    public List<ModelRamScreenDto> findModelRamScreenDtosByPrice(double price) {
        List<Laptop> laptops = laptopRepo.findByPriceGreaterThan(price);
        return laptops
                .stream()
                .map(x->ModelRamScreenDto
                        .builder()
                        .ram(x.getRam())
                        .screen(x.getScreen())
                        .model(x.getProduct().getModel())
                        .build())
                .toList();
    }
}
