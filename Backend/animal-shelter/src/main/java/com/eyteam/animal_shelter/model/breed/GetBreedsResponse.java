package com.eyteam.animal_shelter.model.breed;

import lombok.Value;

import java.util.List;



public record GetBreedsResponse(List<Breed> breeds) {

}
