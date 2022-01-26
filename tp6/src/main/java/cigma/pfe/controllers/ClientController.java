package cigma.pfe.controllers;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;

public class ClientController {

    ClientService clientService ;


    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with clientService param....");
        this.clientService = clientService;
    }


    public Client save(Client c ){ System.out.println("ClientController level...");
        return clientService.save(c); }

    public ClientController()
    { System.out.println("Call ClientController ...."); }
}
