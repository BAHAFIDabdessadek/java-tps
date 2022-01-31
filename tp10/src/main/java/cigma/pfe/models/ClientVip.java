package cigma.pfe.models;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@PrimaryKeyJoinColumn(name="vip_id")
public class ClientVip  extends Client {
    private String preferences;
    public ClientVip(String name, String preferences) {
        super(name);
        this.preferences = preferences; }

}
