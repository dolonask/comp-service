package kg.megalab.comp_service.service.impl;

import kg.megalab.comp_service.model.Printer;
import kg.megalab.comp_service.model.dto.PrinterDto;
import kg.megalab.comp_service.repo.PrinterRepo;
import kg.megalab.comp_service.service.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrinterServiceImpl implements PrinterService {
    @Autowired
    private PrinterRepo printerRepo;

    @Override
    public List<PrinterDto> findPrinterDtosByColor(char color) {
        List<Printer> printers = printerRepo.findByColor(color);

        return printers
                .stream()
                .map(x->PrinterDto
                        .builder()
                        .type(x.getType())
                        .price(x.getPrice())
                        .code(x.getCode())
                        .model(x.getProduct().getModel())
                        .color(x.getColor())
                        .build())
                .toList();
    }
}
