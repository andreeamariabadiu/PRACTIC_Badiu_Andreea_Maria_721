package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fine {
    private int id;

    @JsonProperty("vehicleId")
    private int vehicleId;

    private FineReason reason;
    private int amount;
    private int timeSlot;


    public Fine() {};

    public Fine(int id, int vehicleId, FineReason reason, int amount, int timeSlot) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.reason = reason;
        this.amount = amount;
        this.timeSlot = timeSlot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("reason")
    public void setReasonFromString(String typeRaw) {
        if ("SPEEDING".equals(typeRaw)) {
            this.reason = FineReason.SPEEDING;
        }
        else if ("RED_LIGHT".equals(typeRaw)) {
            this.reason = FineReason.RED_LIGHT;
        }
        else {
            this.reason = FineReason.OTHER;
        }
    }

    public FineReason getReason() {
        return reason;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
