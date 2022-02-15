package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService service;
    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }
    @PutMapping("/modify")
    public Client modify(Client clt) {
        return service.modify(clt);
    }
    public void remove(long idClt) {
        service.remove(idClt);
    }
    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long idClt) {
        return service.getOne(idClt);
    }
    @GetMapping("/all")
    public List<Client> getAll() {
        return service.getAll();
    }

    public List<Client> Find(String name){
        return service.Find(name);
    }

}

