package com.thomasvitale.jpa.demo.repository;

import com.thomasvitale.jpa.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	List<Person> findByFirstName(String firstName);
	List<Person> findByLastName(String lastName);
	Person findBySsn(String ssn);
}
