package cigma.pfe.repositories;


import cigma.pfe.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
    List <Client> findByName(String name);

}