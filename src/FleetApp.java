import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FleetApp {

    private List<Vehicle> vehicles = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("\nFleet Management System");
            System.out.println("1. Print all vehicles");
            System.out.println("2. Add new car");
            System.out.println("3. Add new bus");
            System.out.println("4. Show total yearly insurance fees");
            System.out.println("5. Show vehicles older than N years");
            System.out.println("6. Perform service for all vehicles");
            System.out.println("7. Quit");
            int choice = readInt("Choose option: ");
            switch (choice) {
                case 1:
                    printAllVehicles();
                    break;
                case 2:
                    addNewCar();
                    break;
                case 3:
                    addNewBus();
                    break;
                case 4:
                    showTotalInsuranceFees();
                    break;
                case 5:
                    showVehiclesOlderThanNYears();
                    break;
                case 6:
                    performServiceForAll();
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting Fleet Management System.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void printAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the fleet");
            return;
        }

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    private void addNewCar() {
        System.out.print("Model: ");
        String model = scanner.nextLine();

        int year = readInt("Year: ");
        double basePrice = readDouble("Base price: ");
        int doors = readInt("Number of doors: ");

        Vehicle car = new Car(model, year, basePrice, doors);
        vehicles.add(car);

        System.out.println("Car added successfully.");
    }

    private void addNewBus() {
        System.out.print("Model: ");
        String model = scanner.nextLine();

        int year = readInt("Year: ");
        double basePrice = readDouble("Base price: ");
        int capacity = readInt("Passenger capacity: ");

        Vehicle bus = new Bus(model, year, basePrice, capacity);
        vehicles.add(bus);

        System.out.println("Bus added successfully.");
    }

    private void showTotalInsuranceFees() {
        double total = 0;

        for (Vehicle v : vehicles) {
            total += v.calculateInsuranceFee();
        }

        System.out.println("Total yearly insurance fees: " + total);
    }

    private void showVehiclesOlderThanNYears() {
        int currentYear = readInt("Current year: ");
        int n = readInt("Older than N years: ");

        boolean found = false;

        for (Vehicle v : vehicles) {
            if (v.getAge(currentYear) > n) {
                System.out.println(v);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles older than " + n + " years.");
        }
    }


    private void performServiceForAll() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles to service.");
            return;
        }

        for (Vehicle v : vehicles) {
            v.performService();
        }
    }


    private int readInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Enter a valid number: ");
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    private double readDouble(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("Enter a valid number: ");
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public static void main(String[] args) {
        new FleetApp().run();
    }
}
