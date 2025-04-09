package com.eyteam.animal_shelter.model.dto;


import com.eyteam.animal_shelter.model.animal.Animal;
import com.eyteam.animal_shelter.model.animal.AnimalImage;
import lombok.Data;
import lombok.Value;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;

@Data
@Value
public class AnimalCardDto {

    String name;
    Integer age;
    List<AnimalImageDto> image;
    String description;


    public static AnimalCardDto fromAnimal(Animal a) {
        Integer age = LocalDate.ofEpochDay(System.currentTimeMillis() - a.getDob().atStartOfDay(ZoneId.of("UTC")).toInstant().toEpochMilli()).getYear();
        //TODO add images
        return new AnimalCardDto(
                a.getName(),
                age,
                Collections.emptyList() ,
                a.getDescription()
        );
    }

}
