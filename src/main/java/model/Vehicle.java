package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle {
    private int id;
    private String licensePlate;


    @JsonProperty("type")
    private VehicleType type;


    private String ownerCity;

    @JsonProperty("status")
    private VehicleStatus status;


    public Vehicle() {};

    public Vehicle(int id, String licensePlate, VehicleType type, String ownerCity, VehicleStatus status) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.type = type;
        this.ownerCity = ownerCity;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerCity() {
        return ownerCity;
    }

    public void setOwnerCity(String ownerCity) {
        this.ownerCity = ownerCity;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "[" + id + "] " + licensePlate + " | " + type + " | " + status + " | " + "city=" + ownerCity;
    }
}
