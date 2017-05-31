/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.CascadeType;

import javax.persistence.Id;
import edu.infsci2560.models.Car;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;
    private String email;
    //(cascade = {CascadeType.ALL})
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Car> cars;

    protected Customer() {
        this.userName = null;
        this.password = null;
        this.email = null;
        this.id = Long.MAX_VALUE;
        this.cars = new ArrayList<Car>();
    }

    public Customer(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.cars = new ArrayList<Car>();
    }

//    @Override
//    public String toString() {
//        return String.format("Customer[id=%d, Name='%s', lastName='%s']", getId(), getUserName(), getPassword(), getEmail());
//    }

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
    public String getUserName() {
        return userName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setUserName(String firstName) {
        this.userName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param lastName the lastName to set
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
    
    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    

//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Long id;
//    private String password;
//    private String userName;
////    private String Username;
//    private String email;
//    @ManyToOne
//    private List<Car> cars;
//
//    protected Customer() {
//        this.userName = null;
//        this.password = null;
//        this.email = null;
//        this.id = Long.MAX_VALUE;
//    }
//
//    public Customer(Long id, String username, String password, String email) {
//        this.id = id;
//        this.password = password;
//        this.userName = username;
//        this.email = email;
//        this.cars = null;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Customer[id=%d, UserName='%s', Password='%s', Email='%s']", getId(), getUserName(), getPassword(), getEmail());
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
//    public void setUserName(String username) {
//        this.userName = username;
//    }
//    /**
//     * @param firstName the firstName to set
//     */
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    
//    
//    public String getEmail() {
//        return email;
//    }
//    
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    
//    public void saveCar(Car c) {
//        cars.add(c);
//    }
//    public List<Car> getCars() {
//        return cars;
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
