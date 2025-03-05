package com.eyteam.animal_shelter.service;


import com.eyteam.animal_shelter.model.color.Color;
import com.eyteam.animal_shelter.model.color.GetAllColorsResponse;
import com.eyteam.animal_shelter.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorService {

    @Autowired
    ColorRepository repository;

    public GetAllColorsResponse getColors(){
        return new GetAllColorsResponse(repository.findAll());
    }

    public Color getColorById(Integer id){
        return repository.findById(id).orElse(null);
    }

}
