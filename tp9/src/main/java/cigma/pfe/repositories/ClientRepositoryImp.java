package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClientRepositoryImp implements ClientRepository{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    public ClientRepositoryImp() {
    }

    @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Client update(Client c){
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class,c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null ;
    }

    @Override
    public void deleteById(long id){
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,id);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
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

    //Factures


    @Override
    public Facture create(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public List<Facture> read() {
        List<Facture> Read2 = em.createQuery("select e from TFactures e").getResultList();
        return Read2;
    }

    @Override
    public void deleteFactureById(long id) {

        em.getTransaction().begin();
        Facture clientInDataBase = em.find(Facture.class,id);
        em.remove(clientInDataBase);
        em.getTransaction().commit();

    }
    @Override
    public Facture update(Facture f) {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,f.getId());
        currentFacture.setAmount(f.getAmount());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null ;
    }
}
