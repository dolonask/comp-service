package kg.megalab.comp_service.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "pcs")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pc {
    @Id
    Integer code;
    int speed;
    int ram;
    double hd;
    @Column(length = 10)
    String cd;
    double price;

    @ManyToOne
    @JoinColumn(name = "model", nullable = false)
    Product product;
}
