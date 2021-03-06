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
import java.util.ArrayList;
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
    

    @RequestMapping(value = "/public/cars", method = RequestMethod.GET)
     @ResponseBody
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
        return new ModelAndView("cars", "cars", repository.findAll());  
    }
    @RequestMapping(value = "/getCarData", method = RequestMethod.GET)
    public  @ResponseBody Object getCarData() {
    	return repository.findAll();
    }
     @RequestMapping(value = "/public/getCarData", method = RequestMethod.GET)
    public  @ResponseBody Object getPublicCarData() {
    	return repository.findAll();
    }
    
    
@RequestMapping(value = "carInfo/{id}")
    public ModelAndView carInfo(@PathVariable("id") Long id) {
 
        return new ModelAndView("carInfo","car",repository.findById(id).get(0));
//        return new ModelAndView("sellcars", "cars", repository.findAll());
    }
}
