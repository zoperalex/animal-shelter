package com.eyteam.animal_shelter.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
public class Breed {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String type;

    @Column(name = "created_on")
    LocalDate createdOn;
}
