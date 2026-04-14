package kg.megalab.comp_service.controller;

import kg.megalab.comp_service.model.dto.ModelSpeedHdDto;
import kg.megalab.comp_service.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pc")
public class PcController {

    @Autowired
    private PcService pcService;

    @GetMapping("/task1")
    public ResponseEntity<?> findModelSpeedHdDtosByPrice(@RequestParam double price){
        List<ModelSpeedHdDto> modelSpeedHdDtos = pcService.findModelSpeedHdDtosByPrice(price);
        return ResponseEntity.ok(modelSpeedHdDtos);
    }
}
