package com.eyteam.animal_shelter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AnimalController
{

    @GetMapping("name")
    public String getName(){
        return "Hello World";
    }
}
