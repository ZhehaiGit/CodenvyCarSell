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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    
    @RequestMapping(value = "cars",  method = RequestMethod.DELETE, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView remove(@RequestParam("id") Long id) {
        repository.delete(id);
         ModelAndView mv = new ModelAndView("foods");
        mv.addObject("foods", repository.findAll());
        return mv;
    }
}
