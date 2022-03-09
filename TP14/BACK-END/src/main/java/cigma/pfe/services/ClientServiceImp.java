package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClientServiceImp implements ClientService {

    @Autowired
     ClientRepository clientRepository;


    @Override
    public Client save(Client clt) {
        return clientRepository.save(clt);
    }

    @Override
    @Transactional
    public Client modify(Client newClt) {
        Client oldClt = clientRepository.findById(newClt.getId()).get();
        oldClt.setName(newClt.getName());
        return clientRepository.save(oldClt);
    }

    @Override
    @Transactional
    public void remove(long idClt) {
        clientRepository.deleteById(idClt);
    }

    @Override
    public Client getOne(long idClt) {
        return clientRepository.findById(idClt).get();
    }

    @Override
    public List<Client> getAll() {
        return (List<Client>) clientRepository.findAll();
    }

    public  List<Client> Find(String clt){
        return clientRepository.findByName(clt);
    }
}
