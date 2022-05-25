package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Controller
public class MvcController {

    ArrayList<Customer> custlist = new ArrayList<>();
    List<String> userslist=new ArrayList<>();
    @Bean 
    public CommandLineRunner demo(CustomerRepository repository){
        return (args) -> {
            //adding customers in repository
            repository.save(new Customer("ravi","ravi"));
            repository.save(new Customer("rani","rani"));
            repository.save(new Customer("grp1","raju,chutki"));
            repository.save(new Customer("grp2","ramesh,suresh"));
        
            for(Customer cus:repository.findAll()){
                    custlist.add(cus);
                    userslist.add(cus.getName());
                }
            
        };
    }  
 
     
    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";

    }
    @GetMapping("/dropdownform")
    public String showForm(Model model){
        //SelectUsers selectusers=new SelectUsers();
        //model.addAttribute("selectusers",selectusers);
        Customer customer = new Customer();
        model.addAttribute("customer",customer);
        return "dropdownform";
    }

    @PostMapping("/dropdownform")
    public String submitForm(@ModelAttribute("selectusers")SelectUsers selectusers){

        return "register_success";
    }
}