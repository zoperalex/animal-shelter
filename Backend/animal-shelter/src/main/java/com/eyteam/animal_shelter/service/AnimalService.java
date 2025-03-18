package com.eyteam.animal_shelter.service;

import com.eyteam.animal_shelter.model.animal.*;
import com.eyteam.animal_shelter.model.dto.GetAllAnimalCardResponse;
import com.eyteam.animal_shelter.model.dto.GetAllAnimalsResponse;
import com.eyteam.animal_shelter.repository.AnimalRepository;
import com.eyteam.animal_shelter.repository.specifications.AnimalSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<GetAllAnimalsResponse> getAllAnimals() {
        final List<Animal> animals = animalRepository.findAll();
        if (animals.isEmpty() || animals == null) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(new GetAllAnimalsResponse(animals));
    }

    public ResponseEntity<Animal> getAnimalById(Integer id) {
        final Optional<Animal> animal = animalRepository.findAnimalById(id);
        return ResponseEntity.of(animal);
    }

    public ResponseEntity<GetAllAnimalCardResponse> getAllAnimalCards() {
        final List<Animal> animals = animalRepository.findAll();
        if (animals.isEmpty() || animals == null) {
            return ResponseEntity.noContent().build();
        }
        final List<AnimalCard> animalCards = animals.stream().map(AnimalCard::fromAnimal).toList();
        return ResponseEntity.ok(new GetAllAnimalCardResponse(animalCards));
    }


    public ResponseEntity<AnimalCard> getAnimalCard(Integer id) {
        final Optional<Animal> animal = animalRepository.findAnimalById(id);
        if (animal.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(animal.map(AnimalCard::fromAnimal).get());
    }


    public ResponseEntity<GetAllAnimalsResponse> getFilteredAnimals(Integer colorId, Integer breedId, Boolean disabilities) {
        final List<Animal> animals = animalRepository.findAll(AnimalSpecification.filterByParams(breedId, colorId, disabilities));
        if(animals.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(new GetAllAnimalsResponse(animals));
    }
}
