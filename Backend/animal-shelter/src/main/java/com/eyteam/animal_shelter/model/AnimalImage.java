package com.eyteam.animal_shelter.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AnimalImage {
    private int id;

    @Column(name = "animal_id")
    private int animalId;
    private String name;
    private byte[] image;
}
