package com.example.javaariline.services;


import com.example.javaariline.data.entities.Passenger;
import com.example.javaariline.data.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;



    public void create(String firstName, String lastName, String email, String password, String phoneNumber, double balance){

        Passenger passenger =  new Passenger(firstName,lastName,email,password, phoneNumber,balance);
        passengerRepository.save(passenger);
    }

    public void delete(long passengerID){
        Passenger passenger = passengerRepository.findByID(passengerID);
        passengerRepository.delete(passenger);
    }

    public void update(long passengerID, String password, String newPassword, String firstName, String lastName, String email, String phoneNumber, double balance){

        Passenger passenger = passengerRepository.findByID(passengerID);
        passengerRepository.save(passenger);

        if (newPassword != null)
            passenger.setPassword(newPassword);
        if (firstName != null)
            passenger.setFirstName(firstName);
        if (lastName != null)
            passenger.setLastName(lastName);
        if (email != null)
            passenger.setEmail(email);

            passenger.setBalance(balance);

        passengerRepository.save(passenger);

    }
}