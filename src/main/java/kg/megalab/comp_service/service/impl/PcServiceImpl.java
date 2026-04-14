package kg.megalab.comp_service.service.impl;

import kg.megalab.comp_service.model.Pc;
import kg.megalab.comp_service.model.dto.ModelSpeedHdDto;
import kg.megalab.comp_service.repo.PcRepo;
import kg.megalab.comp_service.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcServiceImpl implements PcService {

    @Autowired
    private PcRepo pcRepo;
    @Override
    public List<ModelSpeedHdDto> findModelSpeedHdDtosByPrice(double price) {
        List<Pc> pcs = pcRepo.findByPriceLessThan(price);
        return pcs
                .stream()
                .map(x-> ModelSpeedHdDto
                        .builder()
                        .model(x.getProduct().getModel())
                        .speed(x.getSpeed())
                        .hd(x.getHd())
                        .build())
                .toList();
    }
}
