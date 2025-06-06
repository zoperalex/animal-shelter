package com.eyteam.animal_shelter.model.dto;

import com.eyteam.animal_shelter.model.animal.Animal;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class GetAllAnimalsResponse {

    @JsonProperty("animals")
    List<Animal> animals;
}
