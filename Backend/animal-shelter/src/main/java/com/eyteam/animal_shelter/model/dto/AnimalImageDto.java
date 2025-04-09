package com.eyteam.animal_shelter.model.dto;

import com.eyteam.animal_shelter.model.animal.Animal;
import jakarta.persistence.*;

public class AnimalImageDto {

    private Integer id;

    private AnimalDto animal;

    private String name;

    private byte[] image;
}
