//package edu.infsci2560.controllers;
//
//import edu.infsci2560.models.Car;
//import edu.infsci2560.models.Customer;
//import edu.infsci2560.models.Car.WorkoutType;
//import edu.infsci2560.repositories.CustomerRepository;
//import javax.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import org.springframework.web.servlet.view.RedirectView;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.filter.HiddenHttpMethodFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import edu.infsci2560.repositories.CarRepository;
//public class signInAndRegistrationControl {
//
//    @Autowired
//    private CustomerRepository CustRepository;
//    @RequestMapping(value = "/registration", method = RequestMethod.GET)
//    public String registration(Model model) {
//        model.addAttribute("userForm", new Customer());
//
//        return "registration";
//    }
//
//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public String registration(@ModelAttribute("userForm") Customer customer, BindingResult bindingResult, Model model) {
//        
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//
//        CustRepository.save(customer);
//        securityService.autologin(customer.getUserName(), customer.getPassword());
//        return "redirect:/welcome";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(Model model, String error, String logout) {
//        if (error != null)
//            model.addAttribute("error", "Your username and password is invalid.");
//
//        if (logout != null)
//            model.addAttribute("message", "You have been logged out successfully.");
//
//        return "login";
//    }
//
//    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
//    public String welcome(Model model) {
//        return "welcome";
//    }
//}