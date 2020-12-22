package com.example.javaariline.data.repositories;

import com.example.javaariline.data.entities.Passenger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface PassengerRepository extends CrudRepository<Passenger,Long> {

    Passenger findByID(long id);
}
