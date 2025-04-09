package com.eyteam.animal_shelter.model.animal;


import com.eyteam.animal_shelter.model.breed.Breed;
import com.eyteam.animal_shelter.model.color.Color;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "birth_date")
    private LocalDate dob;

    private String sex;

    @ManyToOne
    @JoinColumn(name = "breed_id", referencedColumnName = "id", nullable = false)
    private Breed breed;

    private String background;

    private String description;

    @ManyToOne
    @JoinColumn(name = "color_id", referencedColumnName = "id")
    private Color color;

    @Column(name= "disabilities")
    private Boolean hasDisabilities;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

}
