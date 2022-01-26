package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.services.ClientService;

import java.util.List;

public class ClientController {

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

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

    // Facture
    public Facture create(Facture f){
        return clientService.create(f);
    }
    public List<Facture> read(){
        return clientService.read();
    }
    public void delete(long id){
        clientService.delete(id);
    }
    public Facture update(Facture f){
    return  clientService.update(f);
    }
}

