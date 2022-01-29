package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImp implements ClientService {
    @Autowired
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


}
