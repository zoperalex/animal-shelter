package com.eyteam.animal_shelter.controller;


import com.eyteam.animal_shelter.model.animal.Animal;
import com.eyteam.animal_shelter.model.animal.AnimalCard;
import com.eyteam.animal_shelter.model.animal.GetAllAnimalCardResponse;
import com.eyteam.animal_shelter.model.animal.GetAllAnimalsResponse;
import com.eyteam.animal_shelter.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService service;


    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetAllAnimalsResponse getAllAnimals() {
        return service.getAllAnimals();
    }

    @GetMapping(value = "/{id}")
    public Animal getAnimal(@PathVariable("id") Integer id) {
        return service.getAnimalById(id);
    }

    @GetMapping(value = "/cards")
    public GetAllAnimalCardResponse getAnimalCards() {
        return service.getAllAnimalCards();
    }

    @GetMapping(value = "/cards/{id}")
    public AnimalCard getAnimalCard(@PathVariable Integer id){
        return service.getAnimalCard(id);
    }

    @GetMapping(value = "/search")
    public GetAllAnimalsResponse getAnimals(
            @RequestParam String colorId,
            @RequestParam String breedId){

        return null;
    }


}
