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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author kolobj
 */
@Entity
public class Car {

    private static final long serialVersionUID = 1L;

    public enum WorkoutType {
        Unknown,
        Van,
        SUV,
        Coupe,
        Truck,
        Sedan,
        Convertible,
    }
    
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected WorkoutType workoutType;
//    protected String price;
//    protected String location;
//    protected String mileage;
    protected String describe;
    protected String Email;
    protected String Dealer;

    public Car() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.workoutType = WorkoutType.Unknown;
        this.describe =  null;
//        this.location = null;
//        this.price = null;
//        this.mileage = null;
        this.Email = null;
        this.Dealer = null;
    }

    public Car(Long id, String name, WorkoutType workoutType, String des, String email, String dealer) {
        this.id = id;
        this.title = name;
        this.workoutType = workoutType;
//        this.price = pri;
//        this.location = loc;
//        this.mileage = mil;
        this.describe = des;
        this.Email = email;
        this.Dealer = dealer;
    }
    /**
     * @return the Email
     */
    public String getEmail(){
        return Email;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    
    public String getDealer(){
        return Dealer;
    }
    public void setDealer(String dealer){
        this.Dealer = dealer;
    }
    
    public String getDescribe(){
        return describe;
    }
    public void setDescribe(String des){
        describe=des;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", workoutType=" + this.workoutType +", describe=" + this.describe + ", email=" + this.Email +", dealer=" + this.Dealer +"]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the workoutType
     */
    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
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

}
