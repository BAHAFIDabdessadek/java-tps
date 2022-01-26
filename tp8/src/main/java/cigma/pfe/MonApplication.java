package cigma.pfe;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.*;


public class MonApplication {

    public static void main(String[] args) {

            ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");

            ClientController ctrl = (ClientController) c.getBean("ctrl1");

                            ctrl.save(new Client("OMAR"));
                            ctrl.save(new Client("SIHAM"));
                            ctrl.save(new Client("AHMED"));
                            ctrl.save(new Client("FARAH"));


                ctrl.modify(new Client(1L,"kamal"));
                 /*    ctrl.removeById(1L);*/

            Client found = ctrl.getById(1L);
            ctrl.getAll();

            // Facture

           //  ctrl.create(new Facture(new Date(2022, 02, 11),100));
          //   ctrl.read();
         //    ctrl.delete(8);
        //     ctrl.update(new Facture(9,new Date(2022-01-14),400));

    }
}
