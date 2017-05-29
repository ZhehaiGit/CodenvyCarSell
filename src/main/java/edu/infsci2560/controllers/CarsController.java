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
public class CarsController {
    @Autowired
    private CarRepository repository;
    private CustomerRepository cstmRepository;
    final static Logger log = LoggerFactory.getLogger(CarsController.class);
    
    
    @RequestMapping(value = "loginin", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("login", "login", null);
    }
    
    @RequestMapping(value = "auth", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView auth(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (username.equals("zzh") && password.equals("hzz")) {
            return new ModelAndView("cars", "cars", repository.findAll());
//            return new ModelAndView("customer", "customer", cstmRepository.findByLastName("username"));
        } else {
            return new ModelAndView("param.error");
        }
    }


//        if (cstmRepository.contains(username) && cstmRepository.get(username).Password.equals(password) {
//            return new ModelAndView("home", "cars", repository.findAll());
//        } else {
//            
//        }     


    
    
    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public ModelAndView cars() {
        return new ModelAndView("cars", "cars", repository.findAll());
    }
    
//    @RequestMapping(value = "cars", method = RequestMethod.GET)
//    public ModelAndView cars() {
//        return new ModelAndView("cars", "cars", repository.findAll());
//    }
    
    @RequestMapping(value = "sellcars", method = RequestMethod.GET)
    public ModelAndView SellCars() {
        return new ModelAndView("sellcars", "cars", repository.findAll());
    }
    @RequestMapping(value = "removecar", method = RequestMethod.GET)
    public ModelAndView removecar() {
        return new ModelAndView("removecar", "cars", repository.findAll());
    }
    
    @RequestMapping(value = "sellcarsadd", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Car car, BindingResult result) {
        repository.save(car);
        return new ModelAndView("sellcars", "cars", repository.findAll());
    }
    
//    @RequestMapping(value = "/removecardelt",  method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
//    public ModelAndView remove(@RequestParam("id") Long id) {
//        if (repository.findOne(id) != null) {
//           repository.delete(id);
////           id++;
////           while (repository.findOne(id) != null) {
////               repository.findOne(id).setId(id-1);
////               id++;
////           }
//        } else {
//            log.error("ID not exsit!");
//        }
//        return new ModelAndView("removecar", "cars", repository.findAll());
//    }
    
    @RequestMapping( value = "delete-task/{id}",method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView deleteTask(@PathVariable("id")  Long id){
        if (repository.findOne(id) != null) {
           repository.delete(id);
        } else {
            log.error("ID not exsit!");
        }
        return new ModelAndView("removecar", "cars", repository.findAll());
    }
}
