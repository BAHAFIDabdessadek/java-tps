package cigma.pfe.services;

import cigma.pfe.models.Facture;
import cigma.pfe.repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class FactureServiceImp implements FactureService {

    @Autowired
    FactureRepository factureRepository;

    @Override
    public Facture save(Facture f){
       return (Facture) factureRepository.save(f);
    }

    @Transactional
    @Override
    public Facture modify(Facture newFacture) {
     Facture   oldFacture = factureRepository.findById(newFacture.getId()).get();
     oldFacture.setAmount(newFacture.getAmount());
     oldFacture.setDate(newFacture.getDate());

        return factureRepository.save(oldFacture);
    }

    @Override
    public List<Facture> getAll() {
        return (List<Facture>) factureRepository.findAll();
    }

    @Override
    public Facture getOne(long id) {
        return factureRepository.findById(id).get();
    }
    @Transactional
    @Override
    public void remove(long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public List<Facture> Find(LocalDate date) {
        return (List<Facture>) factureRepository.findByDate(date);
    }
}
