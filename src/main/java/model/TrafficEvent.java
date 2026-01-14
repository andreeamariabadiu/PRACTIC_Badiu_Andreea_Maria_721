package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrafficEvent {
    private int id;

    @JsonProperty("vehicleId")
    private int vehicleId;

    private EventType type;

    private int severity;
    private int timeSlot;



    public TrafficEvent() {};

    public TrafficEvent(int id, int vehicleId, EventType type, int severity, int timeSlot) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.type = type;
        this.severity = severity;
        this.timeSlot = timeSlot;
    }


    @JsonProperty("type")
    public void setTypeFromString(String typeRaw) {
        if ("SPEEDING".equals(typeRaw)) {
            this.type = EventType.SPEEDING;
        } else if ("ACCIDENT".equals(typeRaw)) {
            this.type = EventType.ACCIDENT;
        }
        else if ("RED_LIGHT".equals(typeRaw)) {
            this.type = EventType.RED_LIGHT;
        }
        else {
            this.type = EventType.PRIORITY_PASS;
        }
    }

    public EventType getType() {
        return type;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
