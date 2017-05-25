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

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String Name;
    private List<Car> cars;

    protected Customer() {}

    public Customer(String Name) {
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.Name = Name;
        this.cars = null;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, Name='%s', lastName='%s']", getId(), getFirstName(), getLastName());
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
        return Name;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void addCustomerCars(Car car) {
        cars.add(car);
    }
    
    public void deletCustomerCars(Long id) {
        cars.remove(id);
    }
    public List<Car> getCustomerCars() {
        return cars;
    }

}
