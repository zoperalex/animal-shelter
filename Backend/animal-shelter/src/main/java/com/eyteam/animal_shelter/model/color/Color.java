package com.eyteam.animal_shelter.model.color;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String color;

    @Column(name="created_on")
    LocalDate createdOn;
}
