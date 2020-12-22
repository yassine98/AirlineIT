package com.example.javaariline.data.repositories;

import com.example.javaariline.data.entities.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface FlightRepository extends CrudRepository<Flight,Long> {
}
