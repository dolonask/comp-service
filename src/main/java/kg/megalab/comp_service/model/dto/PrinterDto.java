package kg.megalab.comp_service.model.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class PrinterDto {

    Integer code;
    char color;
    String type;
    double price;
    String model;
}
