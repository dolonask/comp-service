package kg.megalab.comp_service.repo;

import kg.megalab.comp_service.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {

    List<Laptop> findByPriceGreaterThan(double price);

}
