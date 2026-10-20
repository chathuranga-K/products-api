package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Created a class which defines the application
@RestController
public class InfoController {

    @GetMapping("/info")
    public String info(){
        return "This application is built using Spring Boot and Java to demonstrate REST API Development";
    }
}
