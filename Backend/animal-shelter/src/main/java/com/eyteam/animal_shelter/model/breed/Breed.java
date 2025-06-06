package com.eyteam.animal_shelter.model.breed;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@Table(name="breed")
public class Breed {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String type;

    @Column(name = "created_on")
    LocalDate createdOn;

    @ManyToOne
    @JoinColumn(name = "species_id", referencedColumnName = "id", nullable = false)
    Species species;

    Boolean active;
}
