package com.eyteam.animal_shelter.controller;


import com.eyteam.animal_shelter.model.breed.Breed;
import com.eyteam.animal_shelter.model.breed.GetBreedsResponse;
import com.eyteam.animal_shelter.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/breed")
public class BreedController {

    @Autowired
    BreedService service;


    @GetMapping()
    public GetBreedsResponse getBreeds(){
        return service.getBreeds();
    }

    @GetMapping("/{id}")
    public Breed getBreedById(@PathVariable Integer id){
        return service.getBreedById(id);
    }
}
