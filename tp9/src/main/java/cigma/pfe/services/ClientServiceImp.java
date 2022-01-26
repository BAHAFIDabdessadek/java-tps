package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.repositories.ClientRepository;

import java.util.List;

public class ClientServiceImp implements ClientService {
    ClientRepository clientRepository;

    public ClientServiceImp(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
        System.out.println("We are in constructor of ClientServiceImp");
    }
    @Override
    public Client save(Client c ){
        return clientRepository.save(c);
    }

    @Override
    public Client modify(Client c){
        return clientRepository.update(c);
    }
    @Override
    public void removeById(long id){
        clientRepository.deleteById(id);
    }
    @Override
    public Client getById(long id){
        return clientRepository.findById(id);
    }
    @Override
    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    // Facture

    @Override
    public Facture create(Facture f){
        return clientRepository.create(f);
    }

    @Override
    public List<Facture> read(){
        return clientRepository.read();
    }
    @Override
    public void delete(long id){
        clientRepository.deleteFactureById(id);
    }

    @Override
    public Facture update(Facture f) {
        return clientRepository.update(f);
    }
}
