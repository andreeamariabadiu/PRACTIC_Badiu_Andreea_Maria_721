package repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import model.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class SCTCSystemRepo {
    private ObjectMapper mapper = new ObjectMapper();



    public List<Vehicle> readVehicle() {
        try {
            return mapper.readValue(new File("vehicles.json"), new TypeReference<List<Vehicle>>(){});
        } catch (IOException e) {
            System.err.println("Error reading vehicles:  " + e.getMessage());
            return new ArrayList<>();
        }
    }


    public List<Fine> readFines() {
        try {
            return mapper.readValue(new File("fines.json"), new TypeReference<List<Fine>>(){});
        } catch (IOException e) {
            System.err.println("Error reading fines:  " + e.getMessage());
            return new ArrayList<>();
        }
    }


    public List<TrafficEvent> readTrafficEvent() {
        try {
            return mapper.readValue(new File("events.json"), new TypeReference<List<TrafficEvent>>(){});
        } catch (IOException e) {
            System.err.println("Error reading events:  " + e.getMessage());
            return new ArrayList<>();
        }
    }
}