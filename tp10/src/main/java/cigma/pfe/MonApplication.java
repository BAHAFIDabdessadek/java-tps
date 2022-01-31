package cigma.pfe;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import cigma.pfe.models.ClientNormal;
import cigma.pfe.models.ClientVip;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.*;


public class MonApplication {

    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) c.getBean("ctrl1");

        ctrl.save(new Client("OMAR"));
        ctrl.save(new ClientVip("OMAR","test"));
        ctrl.save(new ClientNormal("OMAR",2));



    }
}
