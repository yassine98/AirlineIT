package com.example.javaariline.data.entities;


import javax.persistence.*;

/**
 *
 * @author Yassine AOURID
 *
 */

@Entity
@Table (name = "ticket")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatNumber;

    @OneToOne
    private Flight flight;

    public Ticket(String seatNumber, Flight flight) {
        this.seatNumber = seatNumber;
        this.flight = flight;
    }

    public Ticket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}

