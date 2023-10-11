package com.example.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    
    @GetMapping("/login")
    public String Login(){
        return "login";
    }

    @GetMapping("/dashboard")
    public String GetDashboard(){
        return "login";
    }

    @GetMapping("/main")
    public String GetMain(){
        return "main";
    }

        @GetMapping("/confirmarInformacion")
    public String GetConfirmarInformacion(){
        return "confirmarInformacion";
    }

    
}
