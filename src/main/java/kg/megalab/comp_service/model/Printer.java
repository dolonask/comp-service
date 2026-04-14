package kg.megalab.comp_service.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "printers")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Printer {
    @Id
    Integer code;
    char color;
    @Column(length = 10)
    String type;
    double price;
    @ManyToOne
    @JoinColumn(name = "model", nullable = false)
    Product product;
}
