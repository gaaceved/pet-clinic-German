package com.PetClinic.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {
    @RequestMapping({"","/","/index","index.html"})
    String lisOwners(){
        return "owners/index";
    }
}
