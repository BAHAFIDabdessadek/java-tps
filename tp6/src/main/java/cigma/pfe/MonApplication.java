package cigma.pfe;

import cigma.pfe.models.Client;
import cigma.pfe.controllers.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MonApplication {
    public static void main(String[] args) {

        ApplicationContext c =new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) c.getBean("controller");

        Client client = new Client(1,"ALAMI");
        ctrl.save(client);

        List<String> ls = new ArrayList<String>();
        ls.add("ABC");
        ls.add(0,"EF");
        ls.add(1,"ABC");
        ls.add(0,"ABC");
        System.out.println(ls);;






    }
}
