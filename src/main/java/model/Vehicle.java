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

    @JsonProperty("status")
    public void setVehicleStatusFromString(String statusRaw) {
        if ("ACTIVE".equals(statusRaw)) {
            this.status = VehicleStatus.ACTIVE;
        }
        else {
            this.status = VehicleStatus.BLOCKED;
        }
    }

    public VehicleStatus getStatus() {
        return status;
    }

    @JsonProperty("type")
    public void setVehicleTypeFromString(String typeRaw) {
        if ("CAR".equals(typeRaw)) {
            this.type = VehicleType.CAR;
        }
        else if ("BUS".equals(typeRaw)) {
            this.type = VehicleType.BUS;
        }
        else {
            this.type = VehicleType.TRUCK;
        }
    }


    public VehicleType getType() {
        return type;
    }


    @Override
    public String toString() {
        return "[" + id + "] " + licensePlate + " | " + type + " | " + status + " | " + "city=" + ownerCity;
    }
}
