package cigma.pfe;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.*;


public class MonApplication {

    public static void main(String[] args) {

            ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");

            ClientController ctrl = (ClientController) c.getBean("ctrl1");

         /*
            Client client = new Client("Omar");
            List<Facture> factures = Arrays.asList(new Facture(1500.0,"facture1"),new Facture(2000.0,"facture2"));
            client.setFactures(factures);
            ctrl.save(client);
         */

         /*
            Client client = new Client("OMAR");
            List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
            client.setPromotions(promotions);
            ctrl.save(client);
         */

          /*
            Client client = new Client("OMAR");
            CarteFidelio carteFidelio = new CarteFidelio("A29930489");
            carteFidelio.setClient(client);
            client.setCarteFidelio(carteFidelio);
            ctrl.save(client);
         */

        // (ce cas pratique sera noté sur 5 points dans la note des TPs)

        /*
            Facture facture = new Facture(1500.0,"facture1") ;
            List<Produit> produits = Arrays.asList(new Produit("Produi1",20.00),new Produit("Produit2",30.00));
            facture.setProduits(produits);
            ctrl.create(facture);
        */

        /*
            Client client = new Client("OMAR");
            Adresse adresse = new Adresse("Sidi moumen jdid","CASABLANCA","Morocco");
            adresse.setClient(client);
            client.setAdresse(adresse);
            ctrl.save(client);
        */
    }
}
