package ma.cigma.Controllers;

import ma.cigma.Models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ClientController {

    @Value("${api.url}")
    private String apiUrl;

    @Autowired
    RestTemplate restTemplate ;

    @GetMapping(value = {"/","/clients"})
    public String getAll(Model model,@ModelAttribute Client c){
        model.addAttribute("client", c==null? new Client() : c);
        List <List> clients = restTemplate.getForObject(apiUrl+"/client/all",List.class);
        model.addAttribute("clients",clients);
        return "index-client";
    }



    @GetMapping(value = {"/show-client/{id}"})
    public String show(RedirectAttributes ra, @PathVariable  long id ){
        Client client = restTemplate.getForObject(apiUrl+"/client/"+id , Client.class);
        ra.addFlashAttribute("client",client);
        return "redirect:/clients";
    }



    @PostMapping(value = {"/add-or-update"  } , params = "add" )

    public String Add(Model model ,@ModelAttribute("client") Client client)
         {

                restTemplate.postForObject(apiUrl+"/client/create",client,Client.class);

             return "redirect:/clients";

         }


    @PostMapping(value = {"/add-or-update"  } , params = "update" )

    public String update(Model model ,@ModelAttribute("client") Client client)
    {


            restTemplate.put(apiUrl+"/client/modify",client,Client.class);


        return "redirect:/clients";

    }

    @GetMapping(value ={"/delete-client/{id}"})
    public String deleteClientById(Model model,@PathVariable long id){
    restTemplate.delete(apiUrl+"/client/"+id);
        return "redirect:/clients";
    }

    

    }


