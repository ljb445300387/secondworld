package com.wisely.ch8_6_1.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.wisely.ch8_6_1.domain.Person;

public interface PersonRepository extends MongoRepository<Person, String> {

	Person findByName(String name);

	Person findByNameAndAge(String name, Integer age);

	@Query("{'age': ?0}")
	List<Person> withQueryFindByAge(Integer age);

}
