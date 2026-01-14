package main;

import repository.SCTCSystemRepo;
import service.SCTCSystemService;
import model.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Start ===");

        // 1. Instanțiem Repository
        SCTCSystemRepo repo = new SCTCSystemRepo();

        // 2. Citim datele din fișiere
        List<Vehicle> vehicles = repo.readVehicle();
        List<Fine> fines = repo.readFines();
        List<TrafficEvent> events = repo.readTrafficEvent();



        // Afișăm toți șoferii (Cerința 1)
        System.out.println("\n--- All Vehicles ---");
        System.out.println(vehicles);
        }



//        // 3. Instanțiem Service-ul
//        SCTCSystemRepo service = new SCTCSystemRepo(vehicles, fines, events);
//
//        // --- CERINȚA 2: Filtrare ---
//        System.out.println("\n--- Filter by Type and Status ---");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input type and status (ex: BUS ACTIVE): ");
//        String teamName = scanner.nextLine();
//
//    }
};