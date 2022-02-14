package cigma.pfe.services;

import cigma.pfe.models.Facture;

import java.time.LocalDate;
import java.util.List;

public interface FactureService {

    public Facture save(Facture f);
    public Facture modify(Facture f);
    public List<Facture> getAll();
    public Facture getOne(long id);
    public void remove(long id);
    public List<Facture> Find(LocalDate date);
}
