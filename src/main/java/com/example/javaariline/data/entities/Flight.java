package com.example.javaariline.data.entities;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Yassine AOURID
 *
 */

@Entity
@Table (name = "flight")

public class Flight {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Airport provenance;

    @OneToOne
    private Airport destination;

    private Date date;

    @NotNull
    private LocalDateTime time;

    @NotNull
    @OneToOne
    private Airplane airplane;

    @OneToOne
    private Employee pilot;


    public Flight(Airport provenance, Airport destination, Date date, LocalDateTime time, Airplane airplane, Employee pilot) {
        this.provenance = provenance;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.airplane = airplane;
        this.pilot = pilot;
    }

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Airport getProvenance() {
        return provenance;
    }

    public void setProvenance(Airport provenance) {
        this.provenance = provenance;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Employee getPilot() {
        return pilot;
    }

    public void setPilot(Employee pilot) {
        this.pilot = pilot;
    }




}
