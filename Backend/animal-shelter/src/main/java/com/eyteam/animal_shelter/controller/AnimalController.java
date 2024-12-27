package com.eyteam.animal_shelter.controller;


import com.eyteam.animal_shelter.model.GetAllAnimalsResponse;
import com.eyteam.animal_shelter.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AnimalController
{
    @Autowired
    AnimalService service;

    @GetMapping("name")
    public String getName() {
        return "Hello World";
    }

    @GetMapping(value= "animals",produces = MediaType.APPLICATION_JSON_VALUE)
    public GetAllAnimalsResponse getAllAnimals(){
        return service.getAllAnimals();
    }
}
