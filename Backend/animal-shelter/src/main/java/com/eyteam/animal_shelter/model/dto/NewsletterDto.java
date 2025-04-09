package com.eyteam.animal_shelter.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NewsletterDto {

    String title;
    String description;
    byte[] image;
}
