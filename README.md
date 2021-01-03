# JavaAirline


## Project Overview

Welcome to Java Airline! This flight management system facilitates the daily tasks of the customers as
well as the company's staff.
In a nutshell, customers will be able to search, book flights while on the admin side, the employees will
manage the business behind Java Airline (flights managements, airplanes, pilots…)
The purpose of this project is to create and test an application that exhibit some enterprise-level
features and characteristics

## Requirements

* Functional requirements
  * Roles
  There are three roles: Customer , Java Airline IT Dept staff, general admin
  * Customer functionalities
    * A customer shall be able to look for flights given a specific day and time
    * A customer shall be able to login to their personal account’s page
    * A customer shall be able to book a flight
    * A customer shall be able to cancel a flight booking
    * A customer shall be able to communicate with Customer Services by email

  * Java Airline IT Dept Staff
    * A staff member shall be able to view all the bookings made by customers
    * A staff member shall be able to look for a specific customer and retrieve their details
    * A staff member shall be able to add a new flight in the system
    * A staff member shall be able to add a new plane in the system.

  * General admin
    * The general admin shall be able to see the revenues generated during a period of time
    * The general admin shall be able to view relevant statistics regarding flights
    * The general admin shall be able to create a Java Airline IT Dept Staff member
  

* Non-functional requirements
  * Scalability:
  The app shall be scalable as more customers sign up and book flights, at a linearly
increasing cost.
  * Security
    * Customer’s credentials and personal data shall be protected.
    * Customer’s authentication shall be effective and reliable.
    * The app shall preserve the integrity of data it manages during processing, transfer and at rest.
    
  * Graphical User Interface
    * The app shall be visually appealing while keeping its functionalities easy to use
    * KISS principle 

## Technology enablers
For this project I will use the following technologies for the backend:

* Spring Boot:
It is framework that allows to quickly start the development of applications or services by
providing the necessary dependencies
* PostgreSQL:
I have privileged PostgreSQL over MySQL because Postgres is an object-relational database, while MySQL
is a purely relational database. This means that Postgres includes features like table inheritance and
function overloading, which can be important to certain applications. (www.developer.okta.com)

* Java Persistence API / Hibernate:
Hibernate is the ORM tool for Java and JPA allows me to map, store, update and retrieve data from
relational databases to Java objects and vice versa. 

For the frontend, I will Angular as Web framework.
I will be using IntelliJ as Integrated Developing Environment 

## Architecture

### Physical architecture
![Physical architecture](/architecture/physical.PNG)

### Logical architecture
![Logical architecture](/architecture/logical.PNG)


## Design

### Class diagrams

#### Entity class diagram
![Entity class diagram](/design/entity.PNG)

#### Repositories and Services Class Diagram
![Repositories and Services Class Diagram](/design/repo.PNG)

### Sequence diagrams

#### Data-driven Sequence Diagram
![Data-driven Sequence Diagram](/design/data.PNG)

#### Service-driven Sequence Diagram
![Service-driven Sequence Diagram](/design/service.PNG)
