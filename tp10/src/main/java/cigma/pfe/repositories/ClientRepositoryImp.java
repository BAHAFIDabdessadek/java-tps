package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ClientRepositoryImp implements ClientRepository{

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @PersistenceContext
    private EntityManager em;

    public ClientRepositoryImp() {
    }

    @Override
    @Transactional
    public Client save(Client c) {
        em.persist(c);
        return null;
    }

    @Override
    @Transactional
    public Client update(Client c){
        Client currentClient = em.find(Client.class,c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);
        return null ;
    }

    @Override
    @Transactional
    public void deleteById(long id){
        Client clientInDataBase = em.find(Client.class,id);
        em.remove(clientInDataBase);
    }

    @Override
    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }
    @Override
    public List<Client> findAll(){
        List<Client> ListClient = em.createQuery("select e from Tclients e").getResultList();
        return ListClient;
    }


}
