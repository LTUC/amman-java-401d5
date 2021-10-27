package com.asac.helloworld.Repositories;

import com.asac.helloworld.Models.Parking;
import org.springframework.data.repository.CrudRepository;

public interface ParkingRepository extends CrudRepository<Parking,Integer> {
}
