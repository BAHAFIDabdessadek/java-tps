package cigma.pfe;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.Date;


public class MonApplication {

    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctr = (ClientController) c.getBean("ctrl");
        FactureController ftr = (FactureController) c.getBean("fctrol");
/*
        // PART OF CLIENT
        Client client1 = new Client("Omar");
        Client client2 = new Client("Said");
        Client client3 = new Client("Ahmed");
        client1=ctr.save(client1);
        client2=ctr.save(client2);
        client3=ctr.save(client3);

        // Test2 => getAll Clients before modify and remove
        ctr.getAll().stream().forEach(i-> System.out.println(i));

        // Test3 => getOne Client service
        System.out.println(ctr.getOne(1));

        // Test4 => modify Client
        client1.setName("Hassan");
        ctr.modify(client1);

        // Test5 => remove Client service
        ctr.remove(3);

        // Test getAll Client after modify and remove
        ctr.getAll().stream().forEach(i-> System.out.println(i));

        // Find by name
        ctr.Find("Hassan").stream().forEach(i-> System.out.println(i));


 */

        /*
        // PART OF FACTURE

        Facture facture1 = new Facture( LocalDate.of(2022,02,15),400);
        facture1 = ftr.save(facture1);

        // Test2 => getAll Facture before modify and remove
        ftr.getAll().stream().forEach(i-> System.out.println(i));

        // Test3 => getOne Facture
        System.out.println(ftr.getOne(1));

        //  Modify facture


        // Test5 => remove Facture
        ftr.remove(3);

        // Test getAll Facture after modify and remove
        ftr.getAll().stream().forEach(i-> System.out.println(i));

        // Find by Date
        ftr.Find(LocalDate.of(2022,02,14)).stream().forEach(i-> System.out.println(i));

         */






    }
}
