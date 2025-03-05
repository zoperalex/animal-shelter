package com.eyteam.animal_shelter.controller;


import com.eyteam.animal_shelter.model.breed.Breed;
import com.eyteam.animal_shelter.model.breed.GetBreedsResponse;
import com.eyteam.animal_shelter.model.color.Color;
import com.eyteam.animal_shelter.model.color.GetAllColorsResponse;
import com.eyteam.animal_shelter.service.BreedService;
import com.eyteam.animal_shelter.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/color")
public class ColorController {

    @Autowired
    ColorService service;


    @GetMapping()
    public GetAllColorsResponse getColor(){
        return service.getColors();
    }

    @GetMapping("/{id}")
    public Color getColorById(@PathVariable Integer id){
        return service.getColorById(id);
    }
}
