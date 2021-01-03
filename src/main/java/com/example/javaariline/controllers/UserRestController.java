package com.example.javaariline.controllers;

import com.example.javaariline.data.dtos.UserDTO;
import com.example.javaariline.data.entities.Employee;
import com.example.javaariline.data.entities.Flight;
import com.example.javaariline.data.entities.Passenger;
import com.example.javaariline.data.entities.Ticket;
import com.example.javaariline.data.repositories.*;
import com.example.javaariline.services.FlightService;
import com.example.javaariline.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserRestController {

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


    @GetMapping("/passengers")
    public List<Passenger> getAllPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        passengerRepository.findAll().forEach(passenger -> {
            passengers.add(passenger);
        });
        return passengers;
    }

    @PostMapping("/user-login")
    public UserDTO loginUser(@RequestBody UserDTO userDTO) {

        Employee employee = employeeRepository.findByUsername(userDTO.getUsername());
        if (employee != null && employee.getPassword().equals(userDTO.getPassword())) {
            userDTO.setId(employee.getId());
            userDTO.setRole(1);
            return userDTO;
        }

        Passenger passenger = passengerRepository.findByEmail(userDTO.getUsername());
        if (passenger != null && passenger.getPassword().equals(userDTO.getPassword())) {
            userDTO.setId(passenger.getId());
            userDTO.setRole(0);
            return userDTO;
        }
        userDTO.setId(-1L);
        userDTO.setRole(-1);
        userDTO.setMessage("Invalid credentials");
        return userDTO;
    }


    @PostMapping("/save-passenger")
    public Passenger saveNoteBook(@RequestBody Passenger passenger) {
        passenger = passengerRepository.save(passenger);
        return passenger;
    }


    @GetMapping("/reserve")
    public void makeReserve(@RequestParam("id") Long id) {


        Ticket ticket = new Ticket();
        Flight flight = flightRepository.findById(id).get();
        ticket.setFlight(flight);
        ticketRepository.save(ticket);
    }




}
