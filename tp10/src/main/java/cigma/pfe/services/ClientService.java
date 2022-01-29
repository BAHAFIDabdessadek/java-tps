package cigma.pfe.services;

import cigma.pfe.models.Client;

import java.util.List;

public interface ClientService {
    Client save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);
    List<Client> getAll();


}
