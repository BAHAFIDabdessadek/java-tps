package cigma.pfe.models;
import lombok.*;
import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity(name = "Tclients")
// this one when you want to use Inheritance type joined means there is table contains all client and also a table  of client who inheretance in this table
//@Inheritance(strategy = InheritanceType.JOINED)
// this one when you want to use one table what ever how much class extends in client
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Client_Type")
@DiscriminatorValue("Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name;

    public Client(String name) {
        this.name = name; }

    public Client(){}
}
