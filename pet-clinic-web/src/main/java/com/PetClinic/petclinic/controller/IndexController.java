package com.PetClinic.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
    @Controller
    public class indexController {

        @RequestMapping({"/","","/index","index","index.html","/index.html"})
        public String index(){
            return "index";
        }
    }

}
