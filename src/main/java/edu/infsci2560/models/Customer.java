/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import edu.infsci2560.models.Car;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String Password;
    private String Username;
    private String Email;
    private List<Car> cars;

    protected Customer() {}

    public Customer( String password, String username, String email) {
        
        this.Password = password;
        this.Username = username;
        this.Email = email;
        this.cars = null;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, Password='%s', Username='%s', Email='%s']", getId(), getUsername(), getPassword(), getEmail());
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getPassword() {
        return Password;
    }
    public String getUsername() {
        return Username;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setPassword(String password) {
        this.Password = password;
    }
    
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    
//    public void addCustomerCars(Car car) {
//        cars.add(car);
//    }
//    
//    public void deletCustomerCars(Long id) {
//        cars.remove(id);
//    }
//    public List<Car> getCustomerCars() {
//        return cars;
//    }

}
