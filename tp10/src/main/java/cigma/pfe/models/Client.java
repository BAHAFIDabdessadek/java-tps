package cigma.pfe.models;
import lombok.*;
import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity(name = "Tclients")
// this one when you want to use Inhertance type joined means there is table contains all client
// and also a table  of client who extends in this table and id of Client who in Table client = Id in other table
//@Inheritance(strategy = InheritanceType.JOINED)
// this one when you want to use one table what ever how much class extends in client
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "Client_Type")
//@DiscriminatorValue("Client")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {

  //  @GeneratedValue(strategy = GenerationType.IDENTITY) this one not working in Table per class
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
    private long id ;
    private String name;

    public Client(String name) {
        this.name = name; }

    public Client(){}
}
