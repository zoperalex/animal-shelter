package com.eyteam.animal_shelter.model.dto;


import com.eyteam.animal_shelter.model.breed.Breed;
import com.eyteam.animal_shelter.model.color.Color;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalDto {

    private Integer id;

    private String name;

    private String dob;

    private String species;

    private String sex;

    private Breed breed;

    private String background;

    private String description;

    private Color color;

    private Boolean disabled;

}
