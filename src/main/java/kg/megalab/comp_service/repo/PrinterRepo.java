package kg.megalab.comp_service.repo;

import kg.megalab.comp_service.model.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrinterRepo extends JpaRepository<Printer, Integer> {

    List<Printer> findByColor(char color);
}
