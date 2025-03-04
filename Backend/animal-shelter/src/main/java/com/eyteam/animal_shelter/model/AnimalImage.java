package com.eyteam.animal_shelter.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AnimalImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "animal_id", referencedColumnName = "id", nullable = false)
    private Animal animal;

    private String name;
    private byte[] image;
}
