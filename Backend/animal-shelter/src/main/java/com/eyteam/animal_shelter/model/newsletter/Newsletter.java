package com.eyteam.animal_shelter.model.newsletter;

import com.eyteam.animal_shelter.model.dto.NewsletterDto;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Newsletter")
public class Newsletter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String title;
    String description;
    byte[] image;
    Boolean active;
    LocalDateTime createdOn;


    public NewsletterDto toDto(){
        return new NewsletterDto(
                this.title,
                this.description,
                this.image
        );
    }

}
