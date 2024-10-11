package com.example.fristSpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


// This Anotation is use to create a rest controller
@RestController
public class HelloController {
//  This is how to create a get request and see via browser
    @GetMapping("/hello")
    public String Greatings(){
        return "HELLO WORLD!";
    }

//    This is how to create a post request and run using post mam
    @PostMapping("/Hello")
    public String HelloPost(@RequestBody String name){
        return "Welcome" + " " + name+"!";
    }

}
