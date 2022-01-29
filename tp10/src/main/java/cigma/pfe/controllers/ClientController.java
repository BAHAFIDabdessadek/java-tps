package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller("ctrl1")
public class ClientController {
    @Autowired
    ClientService clientService;

    public ClientController(ClientService c ){
        this.clientService = c;
        System.out.println("We are in constructor of ClientController");
    }

    public Client save(Client c ){
        return    clientService.save(c);
    }
    public Client modify(Client c){
        return  clientService.modify(c);
    }
    public void removeById(long id){
        clientService.removeById(id);
    }

    public Client getById(long id){
        return clientService.getById(id);
    }
    public List<Client> getAll(){
        return clientService.getAll();
    }

}

