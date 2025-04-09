package com.eyteam.animal_shelter.controller;


import com.eyteam.animal_shelter.model.dto.NewsletterDto;
import com.eyteam.animal_shelter.model.newsletter.Newsletter;
import com.eyteam.animal_shelter.repository.NewsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("animal/newsletter")
public class NewsletterController {

    @Autowired
    NewsletterRepository repo;

    @GetMapping
    public ResponseEntity<NewsletterDto> getActiveNewsletter(){
       Newsletter news = repo.getActiveNewsletter();
       if(news != null){
           return ResponseEntity.ok(news.toDto());
       }
       return ResponseEntity.notFound().build();
    }



}
