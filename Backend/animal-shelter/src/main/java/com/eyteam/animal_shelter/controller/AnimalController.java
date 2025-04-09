package com.eyteam.animal_shelter.controller;


import com.eyteam.animal_shelter.model.animal.Animal;
import com.eyteam.animal_shelter.model.animal.AnimalCard;
import com.eyteam.animal_shelter.model.dto.GetAllAnimalCardResponse;
import com.eyteam.animal_shelter.model.dto.GetAllAnimalsResponse;
import com.eyteam.animal_shelter.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService service;


    @GetMapping
    public ResponseEntity<GetAllAnimalsResponse> getAllAnimals() {
        return service.getAllAnimals();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Animal> getAnimal(@PathVariable("id") Integer id) {
        return service.getAnimalById(id);
    }

    @GetMapping(value = "/cards")
    public ResponseEntity<GetAllAnimalCardResponse> getAnimalCards() {
        return service.getAllAnimalCards();
    }

    @GetMapping(value = "/cards/{id}")
    public ResponseEntity<AnimalCard> getAnimalCard(@PathVariable Integer id){
        return service.getAnimalCard(id);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<GetAllAnimalsResponse> getAnimals(
            @RequestParam(required = false) Integer colorId,
            @RequestParam(required = false) Integer breedId,
            @RequestParam(required = false) Integer speciedId,
            @RequestParam(required = false) Boolean disabilities){

        return service.getFilteredAnimals(colorId, speciedId, breedId, disabilities);
    }


}
