package com.eyteam.animal_shelter.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

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

}
