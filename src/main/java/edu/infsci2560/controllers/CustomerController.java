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
import edu.infsci2560.repositories.CarRepository;
/**
 *
 * @author kolobj
 */
@Controller
public class CustomerController {
    @Autowired
	HttpServletRequest request;
    @Autowired
    private CarRepository repository;
    @Autowired
    private CustomerRepository CustRepository;
    
//    private String Uname = request.getRemoteUser();
//    final static Logger log = LoggerFactory.getLogger(CarsController.class);

    
    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public ModelAndView su() {
        return new ModelAndView("signup", "signup", null);
    }
    
    
    @RequestMapping(value = "/signup/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView signup(@RequestParam("username") String username, 
                                @RequestParam("password") String password, 
                                @RequestParam("email") String email) {
        Customer newCustomer = new Customer(username, password, email);
        CustRepository.save(newCustomer);
        System.out.println("Success!");
        return new ModelAndView("login", "login", repository.findAll());
    }
    
//    @RequestMapping(value = "cstmCars", method = RequestMethod.GET)
//    public ModelAndView cstmCars() {
//        String Uname = request.getRemoteUser();
////        List<Car> cars = cstmRepository.findByUserName(username).get(0).getCars();
//        return new ModelAndView("customer", "customer", CustRepository.findByUserName(Uname).get(0));
////        return new ModelAndView("customer", "cars", repository.findAll());  
//    }
    
    @RequestMapping(value = "sellcars", method = RequestMethod.GET)
    public ModelAndView SellCars() {
        String Uname = request.getRemoteUser();
//        return new ModelAndView("sellcars", "cars", repository.findAll());
        return new ModelAndView("sellcars", "customer", CustRepository.findByUserName(Uname).get(0));
    }
    @RequestMapping(value = "removecar", method = RequestMethod.GET)
    public ModelAndView removeCar() {
        String Uname = request.getRemoteUser();
//        return new ModelAndView("removecar", "cars", repository.findAll());
        return new ModelAndView("removecar", "customer", CustRepository.findByUserName(Uname).get(0));
    }
    
//    @RequestMapping(value = "sellcarsadd", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
//    public ModelAndView create(@ModelAttribute @Valid Car car, BindingResult result) {
////        repository.save(car);
//        String Uname = request.getRemoteUser();
//        return new ModelAndView("sellcars", "customer", CustRepository.findByUserName(Uname).get(0));
////        return new ModelAndView("sellcars", "cars", repository.findAll());
//    }
    
    
    
    
//    @RequestMapping( value = "delete-task/{id}")
//    public ModelAndView deleteTask(@PathVariable("id")  Long id){
//        if (repository.findOne(id) != null) {
//           repository.delete(id);
//        } else {
//            log.error("ID not exsit!");
//        }
////        return new ModelAndView("removecar", "cars", repository.findAll());
//        return new ModelAndView(new RedirectView("/removecar"));
//    }
    
    
    
}
