package com.eyteam.animal_shelter.model;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Value
public class AnimalCard {

    private String name;
    private Integer age;
    private List<AnimalImage> image;
    private String description;


    public static  AnimalCard fromAnimal(Animal a) {
        Integer age = LocalDate.ofEpochDay(System.currentTimeMillis() - a.getDob().atStartOfDay(ZoneId.of("UTC")).toInstant().toEpochMilli()).getYear();
        return new AnimalCard(
                a.getName(),
                age,
                a.getImage(),
                a.getDescription()
        );
    }

}
