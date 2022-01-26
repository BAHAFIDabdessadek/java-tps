package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import java.util.List;

public interface ClientRepository   {

        Client save(Client c);
        Client update(Client c);
        void deleteById(long id);
        Client findById(long idClient);
        List<Client> findAll();

        // Facture

        Facture create(Facture f);
        List<Facture> read();
        void deleteFactureById(long id);
        Facture update(Facture f);
}
