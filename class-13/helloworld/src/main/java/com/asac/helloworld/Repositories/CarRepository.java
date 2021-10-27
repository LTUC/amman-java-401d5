package com.asac.helloworld.Repositories;

import com.asac.helloworld.Models.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,Integer> {
}
