package com.eyteam.animal_shelter.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Animal {


    @Id
    private Integer id;

    private String name;

    @Column(name = "DoB")
    private LocalDate dob;

    private String species;

    private String sex;

    private String breed;

    private String background;

    private String description;

    private String color;

    @Column(name= "disabilities")
    private Boolean disabled;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private List<AnimalImage> image;
}
