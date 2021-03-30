package com.example.webservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonWebService {

    @GetMapping("/hello")
    public String disBonjour(){
        return "Bonjour !";
    }
}