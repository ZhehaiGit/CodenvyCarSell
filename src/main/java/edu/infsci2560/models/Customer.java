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
import javax.persistence.ManyToOne;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String UserName;
    private String lastName;

    protected Customer() {
        this.UserName = null;
        this.lastName = null;
        this.id = Long.MAX_VALUE;
    }

    public Customer(String firstName, String lastName) {
        this.UserName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, Name='%s', lastName='%s']", getId(), getName(), getLastName());
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
    public String getName() {
        return UserName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setName(String firstName) {
        this.UserName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Long id;
//    private String Password;
//    private String name;
////    private String Username;
//    private String Email;
//    @ManyToOne
//    private List<Car> cars;
//
//    protected Customer() {}
//
//    public Customer(String username, String password, String email) {
//        this.Password = password;
//        this.name = username;
//        this.Email = email;
//        this.cars = null;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Customer[id=%d, Username='%s', Password='%s', Email='%s']", getId(), getUsername(), getPassword(), getEmail());
//    }
//
//    /**
//     * @return the id
//     */
//    public Long getId() {
//        return id;
//    }
//
//    /**
//     * @param id the id to set
//     */
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    /**
//     * @return the firstName
//     */
//    public String getPassword() {
//        return Password;
//    }
//    public String getUsername() {
//        return name;
//    }
//
//    /**
//     * @param firstName the firstName to set
//     */
//    public void setPassword(String password) {
//        this.Password = password;
//    }
//    
//    public String getEmail() {
//        return Email;
//    }
//    
//    public String getLastName() {
//        return name;
//    }
//    public void setEmail(String email) {
//        this.Email = email;
//    }
    
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
