package com.example.javaariline.data.dtos;

public class FlightDTO {

    private Long id;
    private Long fromAirPortId;
    private Long toAirPortId;
    private String dateTime;
    private Long airPlaneId;
    private Long pilotId;
    private String departure;
    private String destination;
    private String datetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFromAirPortId() {
        return fromAirPortId;
    }

    public void setFromAirPortId(Long fromAirPortId) {
        this.fromAirPortId = fromAirPortId;
    }

    public Long getToAirPortId() {
        return toAirPortId;
    }

    public void setToAirPortId(Long toAirPortId) {
        this.toAirPortId = toAirPortId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Long getAirPlaneId() {
        return airPlaneId;
    }

    public void setAirPlaneId(Long airPlaneId) {
        this.airPlaneId = airPlaneId;
    }

    public Long getPilotId() {
        return pilotId;
    }

    public void setPilotId(Long pilotId) {
        this.pilotId = pilotId;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
