package cigma.pfe.models;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
//@PrimaryKeyJoinColumn(name="vip_id")
//@DiscriminatorValue("Vip")
public class ClientVip  extends Client {
    private String preferences;
    public ClientVip(String name, String preferences) {
        super(name);
        this.preferences = preferences; }

}
