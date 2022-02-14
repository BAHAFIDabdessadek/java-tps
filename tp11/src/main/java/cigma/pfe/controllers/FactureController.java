package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller("fctrol")
public class FactureController {

    @Autowired
    FactureService service;

    public Facture save(Facture f){
       return  service.save(f);
    }

    public Facture modify(Facture f){
        return service.modify(f);
    }

    public List<Facture> getAll(){
        return service.getAll();
    }
    public Facture getOne(long id){
        return service.getOne(id);
    }

    public void remove(long id){
        service.remove(id);
    }

    public List<Facture> Find(LocalDate date){
        return service.Find(date);
    }

}
