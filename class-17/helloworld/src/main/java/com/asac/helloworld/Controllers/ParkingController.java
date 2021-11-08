package com.asac.helloworld.Controllers;

import com.asac.helloworld.Models.Parking;
import com.asac.helloworld.Repositories.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ParkingController {

    @Autowired
    ParkingRepository parkingRepository;

    // get all parking
    @GetMapping("/parkings")
    public String getAllParkings(Model model){
        List<Parking> allParkings = (ArrayList)parkingRepository.findAll();
        model.addAttribute("allParkings", allParkings);
        return "parkings";
    }

    // add a parking
    // Explain response entity
    @PostMapping("/parkings")
    public RedirectView addParking(Parking parking){
        parkingRepository.save(parking);
        return new RedirectView("/locations");
    }
}
