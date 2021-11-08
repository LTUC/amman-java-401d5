package com.asac.helloworld.Controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class GeneralController {

    @GetMapping("/")
    public String getHomePage(Principal principal, Model m){
        m.addAttribute("username",principal.getName());
        return "index";
    }

    @GetMapping("/admin")
    public String getAdminPage(){
        return "adminpanel";
    }

}
