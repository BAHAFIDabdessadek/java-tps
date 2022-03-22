package ma.cigma.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Client {

    private long id;
    private String name;

    public Client() { }
    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }

}
