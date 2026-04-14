package kg.megalab.comp_service.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "laptops")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Laptop {
    @Id
    Integer code;
    int speed;
    int ram;
    double hd;
    double price;
    int screen;
    @ManyToOne
    @JoinColumn(name = "model", nullable = false)
    Product product;
}
