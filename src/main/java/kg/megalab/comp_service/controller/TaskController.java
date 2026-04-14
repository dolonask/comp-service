package kg.megalab.comp_service.controller;

import kg.megalab.comp_service.model.dto.ModelRamScreenDto;
import kg.megalab.comp_service.model.dto.ModelSpeedHdDto;
import kg.megalab.comp_service.model.dto.PrinterDto;
import kg.megalab.comp_service.service.LaptopService;
import kg.megalab.comp_service.service.PcService;
import kg.megalab.comp_service.service.PrinterService;
import kg.megalab.comp_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private PcService pcService;
    @Autowired
    private ProductService productService;
    @Autowired
    private LaptopService laptopService;
    @Autowired
    private PrinterService printerService;

    @GetMapping("/1")
    public ResponseEntity<?> findModelSpeedHdDtosByPrice(@RequestParam double price){
        List<ModelSpeedHdDto> modelSpeedHdDtos = pcService.findModelSpeedHdDtosByPrice(price);
        return ResponseEntity.ok(modelSpeedHdDtos);
    }

    @GetMapping("/2")
    public ResponseEntity<?> task2(@RequestParam String type){
        List<String> makers = productService.findMakersByType(type);
        return ResponseEntity.ok(makers);
    }

    @GetMapping("/3")
    public ResponseEntity<?> task3(@RequestParam double price){
        List<ModelRamScreenDto> modelRamScreenDtos = laptopService.findModelRamScreenDtosByPrice(price);
        return ResponseEntity.ok(modelRamScreenDtos);
    }

    @GetMapping("/4")
    public ResponseEntity<?> task4(@RequestParam char color){
        List<PrinterDto> printerDtos = printerService.findPrinterDtosByColor(color);
        return ResponseEntity.ok(printerDtos);
    }


}
