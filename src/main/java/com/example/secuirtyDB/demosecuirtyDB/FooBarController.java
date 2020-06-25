package com.example.secuirtyDB.demosecuirtyDB;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarController {

    @GetMapping("/student")
    public String getFoo(){
        return "hello STU";
    }

    @GetMapping("/admin")
    public String getBar(){
        return "ADMIN";
    }

    @GetMapping("/admin/ ")
    public String getAdminPage(){
        return "admin Page";
    }

    //no authentication
    @GetMapping("/visitor")
    public String getVisitor(){
        return "Visitor";
    }

}