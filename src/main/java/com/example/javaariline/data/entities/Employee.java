package com.example.javaariline.data.entities;


import javax.persistence.*;


/**
 *
 * @author Yassine AOURID
 *
 */

@Entity
@Table (name = "employee")

public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private int role;

}
