package com.eyteam.animal_shelter.repository;
import com.eyteam.animal_shelter.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    // You can add custom query methods here if needed
}
