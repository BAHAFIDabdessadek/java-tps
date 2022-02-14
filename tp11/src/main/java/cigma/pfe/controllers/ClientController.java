package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller("ctrl")
public class ClientController {
    @Autowired
    ClientService service;

    public Client save(Client clt) {
        return service.save(clt);
    }
    public Client modify(Client clt) {
        return service.modify(clt);
    }
    public void remove(long idClt) {
        service.remove(idClt);
    }
    public Client getOne(long idClt) {
        return service.getOne(idClt);
    }
    public List<Client> getAll() {
        return service.getAll();
    }

    public List<Client> Find(String name){
        return service.Find(name);
    }

}

