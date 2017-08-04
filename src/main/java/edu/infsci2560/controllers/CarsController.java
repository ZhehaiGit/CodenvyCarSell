/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Car;
import edu.infsci2560.repositories.CarRepository;
import edu.infsci2560.repositories.CustomerRepository;
import javax.validation.Valid;
import java.util.List;
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
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author kolobj
 */
@Controller
public class CarsController {
    @Autowired
	HttpServletRequest request;
    @Autowired
    private CarRepository repository;
    private CustomerRepository cstmRepository;
    final static Logger log = LoggerFactory.getLogger(CarsController.class);
    
//     @RequestMapping(value = "login", method = RequestMethod.GET)
//    public ModelAndView index() {
//        return new ModelAndView("cars", "cars", repository.findAll());
//    }

//    @RequestMapping(value = "home", method = RequestMethod.GET)
//    public ModelAndView index() {
//        return new ModelAndView("home", "home", null);
//    }
    
//    @RequestMapping(value = "auth", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
//    public ModelAndView auth(@RequestParam("username") String username, @RequestParam("password") String password) {
//        if (username.equals("zzh") && password.equals("hzz")) {
////            return new ModelAndView("cars", "cars", repository.findAll());
//            return new ModelAndView("customer", "customer", cstmRepository.findByUserName("username"));
//        } else {
//            return new ModelAndView("param.error");
//        }
//    }


//        if (cstmRepository.contains(username) && cstmRepository.get(username).Password.equals(password) {
//            return new ModelAndView("home", "cars", repository.findAll());
//        } else {
//            
//        }     

    @RequestMapping(value = "/public/cars", method = RequestMethod.GET)
        public ModelAndView publicCars() {
            return new ModelAndView("pubcar", "cars", repository.findAll());  
        }
    
     @RequestMapping(value = "cstmCars", method = RequestMethod.GET)
     @ResponseBody
    public ModelAndView cstmCars() {
        return new ModelAndView("customer", "cars", repository.findAll());  
    }
    
    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public ModelAndView cars() {
//        String username = request.getRemoteUser();
//        System.out.println(username);
//        List<Car> cars = cstmRepository.findByUserName(username).get(0).getCars();
//        return new ModelAndView("customer", "customer", cstmRepository.findByUserName(username).get(0));
        return new ModelAndView("cars", "cars", repository.findAll());  
    }
    @RequestMapping(value = "/getCarData", method = RequestMethod.GET)
    public  @ResponseBody List<Car> getAllProfiles( ModelMap model ) {
    	List<Car> cars = repository.findAll();
    	return cars;
    }
    
    
@RequestMapping(value = "carInfo/{id}")
//    @Query("UPDATE Customer c SET c.cars = :cars WHERE c.id = :id")
    public ModelAndView carInfo(@PathVariable("id") Long id) {
 
        return new ModelAndView("carInfo","car",repository.findById(id).get(0));
//        return new ModelAndView("sellcars", "cars", repository.findAll());
    }
}
