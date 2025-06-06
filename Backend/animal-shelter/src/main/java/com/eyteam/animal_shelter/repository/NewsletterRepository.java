package com.eyteam.animal_shelter.repository;

import com.eyteam.animal_shelter.model.newsletter.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsletterRepository extends JpaRepository<Newsletter, Integer> {

	@Query("select s from Newsletter s where s.active = true")
	Newsletter getActiveNewsletter();

}
