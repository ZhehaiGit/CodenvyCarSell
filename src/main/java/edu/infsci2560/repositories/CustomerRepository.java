/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.repositories;

import edu.infsci2560.models.Customer;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
//    @Query("select u from #{#entityName} u where u.name = ?1")
//@Query("UPDATE Customer c SET c.ars = :cars WHERE c.id = :id")
    List<Customer> findByUserName(String Name);
}
