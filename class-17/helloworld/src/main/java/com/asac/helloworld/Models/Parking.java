package com.asac.helloworld.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String parkingName;
    private String parkingLocation;
    private int capacity;
    @OneToMany(mappedBy = "carParking")
    List<Car> parkCars;

    public Parking(){

    }

    public Parking(String parkingName, String parkingLocation, int capacity) {
        this.parkingName = parkingName;
        this.parkingLocation = parkingLocation;
        this.capacity = capacity;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getParkingLocation() {
        return parkingLocation;
    }

    public void setParkingLocation(String parkingLocation) {
        this.parkingLocation = parkingLocation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Car> getParkingCars() {
        return parkCars;
    }

    public void setParkingCars(List<Car> parkingCars) {
        this.parkCars = parkingCars;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "parkingName='" + parkingName + '\'' +
                ", parkingLocation='" + parkingLocation + '\'' +
                ", capacity=" + capacity +
                '}';
    }

}
