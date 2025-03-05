package com.eyteam.animal_shelter.repository;


import com.eyteam.animal_shelter.model.color.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color,Integer> {
}
