package com.eyteam.animal_shelter.model.dto;


import com.eyteam.animal_shelter.model.breed.Breed;
import com.eyteam.animal_shelter.model.color.Color;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class AnimalDto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "birth_date")
    private LocalDate dob;

    private String species;

    private String sex;

    @ManyToOne
    @JoinColumn(name = "breed_id", referencedColumnName = "id")
    private Breed breed;

    private String background;

    private String description;

    @ManyToOne
    @JoinColumn(name = "color_id", referencedColumnName = "id")
    private Color color;

    @Column(name= "disabilities")
    private Boolean disabled;

}
