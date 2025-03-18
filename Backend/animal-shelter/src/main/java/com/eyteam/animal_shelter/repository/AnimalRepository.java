package com.eyteam.animal_shelter.repository;
import com.eyteam.animal_shelter.model.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>, JpaSpecificationExecutor<Animal> {

    @Query("select a from Animal a where a.id = :id")
    Optional<Animal> findAnimalById(@Param("id") Integer id);


//    @Query("SELECT new com.eyteam.animal_shelter.model.dto.GetAllAnimalCardResponse(a.name, a.age, a.description, ai.image) FROM Animal a JOIN a.image ai")
//    Optional<List<AnimalCard>> fetchAnimalCards();
    
}
