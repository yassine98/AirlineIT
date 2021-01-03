package com.example.javaariline.data.entities;

import javax.persistence.*;

/**
 *
 * @author Yassine AOURID
 *
 */

@Entity
@Table (name = "airport")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "name")
    private String name;
    @Column (name = "country")
    private String country;
    @Column (name = "city")
    private String city;
    @Column (name = "numberOfTerminals")
    private int numberOfTerminals;

    public Airport(String name, String country, String city, int numberOfTerminals) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.numberOfTerminals = numberOfTerminals;
    }

    public Airport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfTerminals() {
        return numberOfTerminals;
    }

    public void setNumberOfTerminals(int numberOfTerminals) {
        this.numberOfTerminals = numberOfTerminals;
    }
}
