package edu.infsci2560.controllers;

import edu.infsci2560.models.Car;
import edu.infsci2560.models.Customer;
import edu.infsci2560.repositories.CustomerRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author kolobj
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository CustRepository;
    
    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public ModelAndView su() {
        return new ModelAndView("signup", "signup", null);
    }
    
    
    @RequestMapping(value = "/signup/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView signup(@RequestParam("username") String username, 
                                @RequestParam("password") String password, 
                                @RequestParam("email") String email) {
        Customer newCustomer = new Customer(username, password, email);
//        Customer newCustomer = new Customer(username, password);
        CustRepository.save(newCustomer);
        System.out.println("Success!");
        return new ModelAndView("login", "login", null);
    }
    
    @RequestMapping(value = "cstmCars", method = RequestMethod.GET)
    public ModelAndView cars() {
        String username = request.getRemoteUser();
        System.out.println(username);
//        List<Car> cars = cstmRepository.findByUserName(username).get(0).getCars();
        return new ModelAndView("customer", "customer", cstmRepository.findByUserName(username).get(0));
//        return new ModelAndView("cars", "cars", repository.findAll());  
    }
    
}
