package com.example.javaariline.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Yassine AOURID
 *
 */

@Entity
@Table (name = "airport")
public class Airport {

    @Id
    private String code;
    @Column (name = "country")
    private String country;
    @Column (name = "city")
    private String city;
    @Column (name = "numberOfTerminals")
    private int numberOfTerminals;

    public Airport(String code, String country, String city, int numberOfTerminals) {
        this.code = code;
        this.country = country;
        this.city = city;
        this.numberOfTerminals = numberOfTerminals;
    }

    public Airport() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
