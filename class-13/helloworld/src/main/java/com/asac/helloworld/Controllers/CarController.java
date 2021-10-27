package com.asac.helloworld.Controllers;

import com.asac.helloworld.Models.Car;
import com.asac.helloworld.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/cars")
    public String getAllCars(Model model){
        List<Car> allCars = (ArrayList)carRepository.findAll();
        model.addAttribute("allCars", allCars);
        return "index";
    }
}
