package com.PetClinic.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {


        @RequestMapping({"","/", "index", "index.html"})
        public String index(){
            return "index";
        }

    @RequestMapping({"welcome"})
    public String showWelcome(Model model){
        model.addAttribute("welcome", "welcome to the pet clinic application");
        return "index";
    }

}
