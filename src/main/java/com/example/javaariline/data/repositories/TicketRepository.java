package com.example.javaariline.data.repositories;

import com.example.javaariline.data.entities.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface TicketRepository extends CrudRepository<Ticket,Long> {
}
