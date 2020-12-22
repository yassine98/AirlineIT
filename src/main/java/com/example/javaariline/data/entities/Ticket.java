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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "seatNumber")
    private String seatNumber;

    @Column(name = "flightID")
    @OneToOne
    private long flightID;

    public Ticket(String seatNumber, long flightID) {
        this.seatNumber = seatNumber;
        this.flightID = flightID;
    }

    public Ticket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public long getFlightID() {
        return flightID;
    }

    public void setFlightID(long flightID) {
        this.flightID = flightID;
    }
}
