package com.eyteam.animal_shelter.repository.specifications;

import com.eyteam.animal_shelter.model.animal.Animal;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class AnimalSpecification {
    public static Specification<Animal> filterByParams(Integer breedId, Integer colorId, Boolean disabilities) {
        return (Root<Animal> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (breedId != null) {
                predicates.add(cb.equal(root.get("breed").get("id"), breedId));
            }
            if (colorId != null) {
                predicates.add(cb.equal(root.get("color").get("id"), colorId));
            }
            if (disabilities != null) {
                predicates.add(cb.equal(root.get("hasDisabilities"), disabilities));
            }
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}

