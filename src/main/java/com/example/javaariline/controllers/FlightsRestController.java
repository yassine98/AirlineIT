package com.example.javaariline.controllers;

import com.example.javaariline.data.dtos.FlightDTO;
import com.example.javaariline.data.entities.Airplane;
import com.example.javaariline.data.entities.Airport;
import com.example.javaariline.data.entities.Employee;
import com.example.javaariline.data.entities.Flight;
import com.example.javaariline.data.repositories.*;
import com.example.javaariline.services.FlightService;
import com.example.javaariline.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FlightsRestController {

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private FlightService flightService;

    @Autowired
    private PassengerService passengerService;



    @PostMapping("/save-air-plane")
    public Airplane saveNoteBook(@RequestBody Airplane airplane){

        airplane = airplaneRepository.save(airplane);
        return airplane;
    }

    @GetMapping("/air-planes")
    public List<Airplane> getAirPlanes() {
        List<Airplane> airplanes = new ArrayList<>();
        airplaneRepository.findAll().forEach(airplane -> {
            airplanes.add(airplane);
        });
        return airplanes;
    }



    @PostMapping("/save-flight")
    public Flight saveNoteBook(@RequestBody FlightDTO flightDTO) {

        Flight flight = new Flight();

        Airport fromAirPort = airportRepository.findById(flightDTO.getFromAirPortId()).get();
        Airport toAirPort = airportRepository.findById(flightDTO.getToAirPortId()).get();
        Airplane airplane = airplaneRepository.findById(flightDTO.getAirPlaneId()).get();
        Employee employee = employeeRepository.findById(flightDTO.getPilotId()).get();


        String date = flightDTO.getDateTime();

        flight = flightService.saveNoteBook(airplane,toAirPort,fromAirPort,employee,date);
        flight = flightRepository.save(flight);
        return flight;
    }

    @GetMapping("/flights")
    public List<FlightDTO> getAllFlight() {
        List<FlightDTO> flights = new ArrayList<>();
        flightRepository.findAll().forEach(flight -> {
            FlightDTO flightDTO = new FlightDTO();
            flightDTO.setId(flight.getId());
            flightDTO.setDeparture(flight.getProvenance().getName());
            flightDTO.setDestination(flight.getDestination().getName());
            flights.add(flightDTO);
        });
        return flights;
    }


}
