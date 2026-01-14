package service;

import model.*; // Importăm modelele
import java.io.PrintWriter; // Pentru scriere în fișier
import java.util.*; // Pentru List, Map, Comparator
import java.util.stream.Collectors; // Pentru Streams

public class SCTCSystemService {
    // Listele de date cu care lucrăm
    private List<Vehicle> vehicles;
    private List<Fine> fines;
    private List<TrafficEvent> trafficEvents;

    public SCTCSystemService() {};

    // Constructorul primește datele gata citite din Main
    public SCTCSystemService(List<Vehicle> v, List<Fine> f, List<TrafficEvent> t) {
        this.vehicles = v;
        this.fines = f;
        this.trafficEvents = t;
    }

    ;


    // --- CERINȚA 2:

    public List<Vehicle> filterByStatusAndType(String type, String status) {
        // Deschidem stream-ul
        return vehicles.stream()
                .filter(v -> v.getType().equals(type))

                .filter(v -> v.getStatus().equals(status))

                .collect(Collectors.toList());
    }

//    //public List<Vehicle> sortVehicles() {
//     //   return vehicles.stream()
//      //          // Sortăm invers (.reversed) după SkillLevel
//                .sorted(Comparator.comparing(VehicleType::getSkillLevel).reversed()
//                        // Dacă skill-ul e egal, sortăm alfabetic după nume
//                        .thenComparing(Fahrer::getName))
//                .collect(Collectors.toList());
//    }//
};

