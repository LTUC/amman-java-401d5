package com.asac.helloworld.Controllers;

import com.asac.helloworld.Models.AppUser;
import com.asac.helloworld.Repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.PasswordAuthentication;
import java.security.Principal;

@Controller
public class AppUserController {

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    AppUserRepository appUserRepository;

    @GetMapping("/signup")
    public String getSignUpPage(){
        return "signup";
    }

    @PostMapping("/signup")
    public String signUpUser(@RequestParam String username, @RequestParam String password){
        AppUser appUser = new AppUser(username, encoder.encode(password),"ROLE_USER");
        appUserRepository.save(appUser);
        return "login";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    // Profile methods
    @GetMapping("/profile/{id}")
    public String getProfile(@PathVariable int id, Model m){
        AppUser requestedProfile = appUserRepository.findById(id).get();
        m.addAttribute("username",requestedProfile.getUsername());
        m.addAttribute("userRole", requestedProfile.getAuthority());


        m.addAttribute("showEditSection", false);
        return "profile";
    }

    @PutMapping("/profile/{id}")
    public RedirectView updateProfile(@PathVariable int id, Principal principal) throws Exception {
        AppUser loggedInUser = appUserRepository.findByUsername(principal.getName());
        if(loggedInUser == null){
            // you should navigate the user to an error page
            throw new Exception("No user is logged in");
        }

        if(loggedInUser.getId() != id){
            // you should navigate the user to an error page
            throw new Exception("the user is not permitted to edit this profile");
        }

        // save the passed object
        //appUserRepository.save();
        return new RedirectView("profile/"+id);
    }

}
