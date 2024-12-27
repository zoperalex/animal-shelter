package com.eyteam.animal_shelter.service;

import com.eyteam.animal_shelter.model.Animal;
import com.eyteam.animal_shelter.model.GetAllAnimalsResponse;
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
        final List<Animal> animals =  animalRepository.findAll();
        GetAllAnimalsResponse res = new GetAllAnimalsResponse(animals);
        return res;

    }

    public Optional<Animal> getAnimalById(Integer id) {
        return animalRepository.findById(id);
    }

    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public void deleteAnimal(Integer id) {
        animalRepository.deleteById(id);
    }
}
