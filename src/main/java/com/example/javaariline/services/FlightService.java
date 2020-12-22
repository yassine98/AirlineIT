package com.example.javaariline.services;


import com.example.javaariline.data.entities.*;
import com.example.javaariline.data.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class FlightService {

@Autowired
FlightRepository flightRepository;


    public void create (Airport provenance, Airport destination, Date date, LocalDateTime time, Airplane airplane, Employee pilot){
        Flight flight = new Flight(provenance, destination, date, time, airplane, pilot);
        flightRepository.save(flight);
    }

    public void delete(long id){
        Flight flight = flightRepository.findById(id).get();
        flightRepository.delete(flight);
    }



}
