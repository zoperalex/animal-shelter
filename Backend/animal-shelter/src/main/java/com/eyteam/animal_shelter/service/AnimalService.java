package com.eyteam.animal_shelter.service;

import com.eyteam.animal_shelter.model.animal.*;
import com.eyteam.animal_shelter.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public GetAllAnimalsResponse getAllAnimals() {
        final List<Animal> animals = animalRepository.findAll();
        return new GetAllAnimalsResponse(animals);
    }

    public Animal getAnimalById(Integer id) {
        final Optional<Animal> animal = animalRepository.findAnimalById(id);
        return animal.orElseGet(Animal::new);
    }

    public GetAllAnimalCardResponse getAllAnimalCards() {
        final List<Animal> animals = animalRepository.findAll();
        final List<AnimalCard> animalCards = animals.stream().map(AnimalCard::fromAnimal).toList();
        return new GetAllAnimalCardResponse(animalCards);
    }


    public AnimalCard getAnimalCard(Integer id) {
        final Optional<Animal> animal = animalRepository.findAnimalById(id);
        return animal.map(AnimalCard::fromAnimal).orElse(null);
    }




    public GetFilteredAnimalResponse getFilteredAnimals() {
        return null;
    }
}
