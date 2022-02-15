package cigma.pfe.models;
import lombok.*;
import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity(name = "Tclients")
public class Client {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id ;
  private String name;

  public Client(String name) {
    this.name = name; }

  public Client(){}
}
