package com.example.javaariline.data.repositories;

import com.example.javaariline.data.entities.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AirportRepository extends CrudRepository<Airport,Long> {
}
