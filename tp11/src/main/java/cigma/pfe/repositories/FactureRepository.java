package cigma.pfe.repositories;

import cigma.pfe.models.Facture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FactureRepository extends CrudRepository <Facture,Long>  {
   List<Facture> findByDate(LocalDate date);
}
