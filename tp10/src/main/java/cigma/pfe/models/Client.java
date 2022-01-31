package cigma.pfe.Moderls;
import lombok.*;
import javax.persistence.*;
@Data
@Entity(name = "Tclients")
@Inheritance(strategy = InheritanceType.JOINED)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name;

    public Client(String name) {
        this.name = name; }

    public Client(){}
}
