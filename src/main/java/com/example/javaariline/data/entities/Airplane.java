package com.example.javaariline.data.entities;


import javax.persistence.*;

/**
 *
 * @author Yassine AOURID
 *
 */

@Entity
@Table (name = "airplane")
public class Airplane {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String brand;
    private String model;
    private String capacity;


    public Airplane(String brand, String model, String capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    public Airplane() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
