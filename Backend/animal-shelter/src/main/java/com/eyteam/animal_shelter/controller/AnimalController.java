package com.eyteam.animal_shelter.controller;


import com.eyteam.animal_shelter.model.Animal;
import com.eyteam.animal_shelter.model.AnimalCard;
import com.eyteam.animal_shelter.model.GetAllAnimalCardResponse;
import com.eyteam.animal_shelter.model.GetAllAnimalsResponse;
import com.eyteam.animal_shelter.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AnimalController {
    @Autowired
    AnimalService service;


    @GetMapping(value = "animal", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetAllAnimalsResponse getAllAnimals() {
        return service.getAllAnimals();
    }

    @GetMapping(value = "animal/{id}")
    public Animal getAnimal(@PathVariable("id") Integer id) {
        return service.getAnimalById(id);
    }

    @GetMapping(value = "animal/cards")
    public GetAllAnimalCardResponse getAnimalCards() {
        return service.getAllAnimalCards();
    }

    @GetMapping(value = "animal/cards/{id}")
    public AnimalCard getAnimalCard(@PathVariable Integer id){
        return service.getAnimalCard(id);
    }

    @GetMapping(value = "animal/search")
    public GetAllAnimalsResponse getAnimals(
            @RequestParam String colorId,
            @RequestParam String breedId){

        return null;
    }


}
