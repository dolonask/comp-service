package kg.megalab.comp_service.repo;

import kg.megalab.comp_service.model.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<Pc, Integer> {

    // select * from pcs where price < ?
    List<Pc> findByPriceLessThan(double price);


}
