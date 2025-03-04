package com.eyteam.animal_shelter.model;


import lombok.Data;
import lombok.Value;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;

@Data
@Value
public class AnimalCard {

    String name;
    Integer age;
    List<AnimalImage> image;
    String description;


    public static AnimalCard fromAnimal(Animal a) {
        Integer age = LocalDate.ofEpochDay(System.currentTimeMillis() - a.getDob().atStartOfDay(ZoneId.of("UTC")).toInstant().toEpochMilli()).getYear();
        return new AnimalCard(
                a.getName(),
                age,
                Collections.emptyList() ,
                a.getDescription()
        );
    }

}
