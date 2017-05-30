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
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Long id;
//    private String userName;
//    private String lastName;
//
//    protected Customer() {
//        this.userName = null;
//        this.lastName = null;
//        this.id = Long.MAX_VALUE;
//    }
//
//    public Customer(String firstName, String lastName) {
//        this.userName = firstName;
//        this.lastName = lastName;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Customer[id=%d, Name='%s', lastName='%s']", getId(), getUserName(), getLastName());
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
//    public String getUserName() {
//        return userName;
//    }
//
//    /**
//     * @param firstName the firstName to set
//     */
//    public void setUserName(String firstName) {
//        this.userName = firstName;
//    }
//
//    /**
//     * @return the lastName
//     */
//    public String getLastName() {
//        return lastName;
//    }
//
//    /**
//     * @param lastName the lastName to set
//     */
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String password;
    private String userName;
//    private String Username;
    private String email;
    @ManyToOne
    private List<Car> cars;

    protected Customer() {}

    public Customer(Long id, String username, String password, String email) {
        this.id = id;
        this.password = password;
        this.userName = username;
        this.email = email;
        this.cars = null;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, Username='%s', Password='%s', Email='%s']", getId(), getUserName(), getPassword(), getEmail());
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
        return password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String username) {
        this.userName = username;
    }
    /**
     * @param firstName the firstName to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void saveCar(Car c) {
        this.cars.add(c);
    }
    public List<Car> getCars() {
        return cars;
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
