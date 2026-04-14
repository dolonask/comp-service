package kg.megalab.comp_service.service;

import kg.megalab.comp_service.model.dto.PrinterDto;

import java.util.List;

public interface PrinterService {

    List<PrinterDto> findPrinterDtosByColor(char color);
}
