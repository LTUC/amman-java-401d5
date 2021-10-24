package com.asac.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller        // it will deal with return values as names of templated unless I add the "ResponseBody annotation to the function
//@RestController   -> it will deal with return values as is
//@RequestMapping("/homecontroller")   // prefix for the controller
public class HomeController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model){
        model.addAttribute("name","ahmad"); // can be used to add values in pairs form, and they can be used in the template
        return "home";       // because it is a controller annotation, it will expect a name of template returned
    }

    @GetMapping("/getRequest")  // short form of mapping end points
    @ResponseBody               // to deal with return value as is
    public String getRequestFunction(){
        return "This is from the short form get request creation";
    }

    // Path variable     /locations/
    // ?nameOfProperty ..
    @GetMapping("/getRequest/{name}")
    @ResponseBody
    public String welcomeMessage(@PathVariable String name){
        return "home";
    }



}
