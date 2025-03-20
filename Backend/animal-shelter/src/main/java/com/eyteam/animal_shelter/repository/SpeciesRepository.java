package com.eyteam.animal_shelter.repository;

import com.eyteam.animal_shelter.model.breed.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {
}
