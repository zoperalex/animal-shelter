package com.eyteam.animal_shelter.service;


import com.eyteam.animal_shelter.model.breed.Breed;
import com.eyteam.animal_shelter.model.breed.GetBreedsResponse;
import com.eyteam.animal_shelter.repository.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BreedService {

    @Autowired
    BreedRepository repository;

    public GetBreedsResponse getBreeds(){
        return new GetBreedsResponse(repository.findAll());
    }

    public Breed getBreedById(Integer id){
        return repository.findById(id).orElse(null);
    }
}
