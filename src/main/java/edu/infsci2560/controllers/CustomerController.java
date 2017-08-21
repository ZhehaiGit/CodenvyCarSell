package edu.infsci2560.controllers;

import edu.infsci2560.models.Car;
import edu.infsci2560.models.Customer;
import edu.infsci2560.models.Car.WorkoutType;
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
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.annotations.Cascade;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
    final static Logger log = LoggerFactory.getLogger(CarsController.class);
//    final static Logger log = LoggerFactory.getLogger(CarsController.class);

    
    
    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public ModelAndView su() {
        return new ModelAndView("signup", "signup", null);
    }
    
    
    
    @RequestMapping(value = "signupadd")
    public ModelAndView signup(@ModelAttribute @Valid Customer customer, BindingResult result) {
        CustRepository.save(customer);
        return new ModelAndView("login", "login", null);
    }
    
    
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
    
    @RequestMapping(value = "sellcarsadd", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
//    @Query("UPDATE Customer c SET c.cars = :cars WHERE c.id = :id")
    public ModelAndView create(@ModelAttribute @Valid Car car, BindingResult result) {
        
        String Uname = request.getRemoteUser();
        Customer customer = CustRepository.findByUserName(Uname).get(0);
        car.setEmail(customer.getEmail());
        car.setDealer(Uname);
        
        List<Car> cars = customer.getCars();
        cars.add(car);
        customer.setCars(cars);
        CustRepository.save(customer);
        return new ModelAndView("sellcars","customer",CustRepository.findByUserName(Uname).get(0));
//        return new ModelAndView("sellcars", "cars", repository.findAll());
    }
    
    
    
    
    @RequestMapping( value = "delete-task/{id}")
    public ModelAndView deleteTask(@PathVariable("id")  Long id) {
        if (repository.findOne(id) != null) {
           String Uname = request.getRemoteUser();
           Customer customer = CustRepository.findByUserName(Uname).get(0);
           List<Car> cars = customer.getCars();
           for (int i = 0; i < cars.size(); i++) {
               Car c = cars.get(i);
               if (c.getId() == id) {
                   cars.remove(i);
                   customer.setCars(cars);
                   CustRepository.save(customer);
                   break;
               }
           }
            repository.delete(id);
        } else {
            log.error("ID not exsit!");
            
        }
        return new ModelAndView(new RedirectView("/removecar"));
    }
    
    
    
}
