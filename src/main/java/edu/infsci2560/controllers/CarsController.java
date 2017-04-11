/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Car;
import edu.infsci2560.repositories.CarRepository;
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
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kolobj
 */
@Controller
public class CarsController {
    @Autowired
    private CarRepository repository;
    
    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("cars", "cars", repository.findAll());
    }
    
    @RequestMapping(value = "cars/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Car car, BindingResult result) {
        repository.save(car);
        return new ModelAndView("cars", "cars", repository.findAll());
    }
    
    @RequestMapping(value = "cars/delet", method = RequestMethod.DELET)
    public ModelAndView remove(@RequestParam("id") Long id) {
        repository.delete(id);
        return new ModelAndView("cars", "cars", repository.findAll());
    }
}
