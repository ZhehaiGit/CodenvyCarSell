/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.repositories;

import edu.infsci2560.models.Car;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

/**
 *
 * @author kolobj
 */
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {
   List<Car> findById(Long id);

}
