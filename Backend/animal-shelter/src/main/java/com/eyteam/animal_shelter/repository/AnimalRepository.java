package com.eyteam.animal_shelter.repository;
import com.eyteam.animal_shelter.model.Animal;
import com.eyteam.animal_shelter.model.AnimalCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("select a from Animal a where a.id = :id")
    Optional<Animal> findAnimalById(@Param("id") Integer id);



    @Query("select a from Animal a where a.name like :text")
    Optional<List<Animal>> getFilteredAnimalList(@Param("text") String text);

//    @Query("SELECT new com.eyteam.animal_shelter.model.GetAllAnimalCardResponse(a.name, a.age, a.description, ai.image) FROM Animal a JOIN a.image ai")
//    Optional<List<AnimalCard>> fetchAnimalCards();

    
}
