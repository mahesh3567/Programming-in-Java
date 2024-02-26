import java.util.Scanner;

// Main class
public class VehicleInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Car details
        System.out.println("Enter Car details:");
        System.out.print("License Plate: ");
        String carLicensePlate = scanner.nextLine();
        System.out.print("Owner: ");
        String carOwner = scanner.nextLine();
        System.out.print("Number of Seats: ");
        int carSeats = scanner.nextInt();

        // Creating Car object
        Car car = new Car(carLicensePlate, carOwner, carSeats);

        // Taking input for Truck details
        System.out.println("\nEnter Truck details:");
        System.out.print("License Plate: ");
        scanner.nextLine(); // Consume newline character
        String truckLicensePlate = scanner.nextLine();
        System.out.print("Owner: ");
        String truckOwner = scanner.nextLine();
        System.out.print("Load Capacity: ");
        double truckCapacity = scanner.nextDouble();

        // Creating Truck object
        Truck truck = new Truck(truckLicensePlate, truckOwner, truckCapacity);

        // Taking input for Motorcycle details
        System.out.println("\nEnter Motorcycle details:");
        System.out.print("License Plate: ");
        scanner.nextLine(); // Consume newline character
        String bikeLicensePlate = scanner.nextLine();
        System.out.print("Owner: ");
        String bikeOwner = scanner.nextLine();
        System.out.print("Type: ");
        String bikeType = scanner.nextLine();

        // Creating Motorcycle object
        Motorcycle motorcycle = new Motorcycle(bikeLicensePlate, bikeOwner, bikeType);

        scanner.close();

        // Displaying vehicle details
        System.out.println("\nCar Details:");
        car.display();

        System.out.println("\nTruck Details:");
        truck.display();

        System.out.println("\nMotorcycle Details:");
        motorcycle.display();
    }
}
// Superclass Vehicle
class Vehicle {
    private String licensePlate;
    private String owner;

    // Constructor
    public Vehicle(String licensePlate, String owner) {
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    // Getters and setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Owner: " + owner);
    }
}

// Subclass Car
class Car extends Vehicle {
    private int numberOfSeats;

    // Constructor
    public Car(String licensePlate, String owner, int numberOfSeats) {
        super(licensePlate, owner);
        this.numberOfSeats = numberOfSeats;
    }

    // Getter and setter
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    // Method to display car details
    @Override
    public void display() {
        super.display();
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double loadCapacity;

    // Constructor
    public Truck(String licensePlate, String owner, double loadCapacity) {
        super(licensePlate, owner);
        this.loadCapacity = loadCapacity;
    }

    // Getter and setter
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    // Method to display truck details
    @Override
    public void display() {
        super.display();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private String type;

    // Constructor
    public Motorcycle(String licensePlate, String owner, String type) {
        super(licensePlate, owner);
        this.type = type;
    }

    // Getter and setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Method to display motorcycle details
    @Override
    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}