package com.eyteam.animal_shelter.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAnimalCardResponse {

    List<AnimalCard> animalCards;
}
