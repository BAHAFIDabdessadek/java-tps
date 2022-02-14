package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor


@Entity(name = "TFactures")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long id;
    @Column
    private LocalDate date;
    @Column
    private double amount;

    public Facture(){}

    public Facture(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

}