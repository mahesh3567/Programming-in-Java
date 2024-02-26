import java.util.Scanner;


// Main class
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Employee details
        System.out.println("Enter Employee details:");
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double empBasicSalary = scanner.nextDouble();

        // Creating Employee object
        Employee employee = new Employee(empName, empBasicSalary);

        // Taking input for Manager details
        System.out.println("\nEnter Manager details:");
        System.out.print("Name: ");
        scanner.nextLine(); // Consume newline character
        String managerName = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double managerBasicSalary = scanner.nextDouble();
        System.out.print("Travel Allowance: ");
        double travelAllowance = scanner.nextDouble();
        System.out.print("House Rent Allowance: ");
        double houseRentAllowance = scanner.nextDouble();

        // Creating Manager object
        Manager manager = new Manager(managerName, managerBasicSalary, travelAllowance, houseRentAllowance);

        scanner.close();

        // Displaying salaries
        System.out.println("\nEmployee Salary:");
        System.out.println("Name: " + employee.name);
        System.out.println("Salary: " + employee.getSalary());

        System.out.println("\nManager Salary:");
        System.out.println("Name: " + manager.name);
        System.out.println("Salary: " + manager.getSalary());
    }
}
// Employee class
class Employee {
    protected String name;
    protected double basicSalary;

    // Constructor
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to get salary
    public double getSalary() {
        return basicSalary;
    }
}

// Manager class extending Employee class
class Manager extends Employee {
    private double travelAllowance;
    private double houseRentAllowance;

    // Constructor
    public Manager(String name, double basicSalary, double travelAllowance, double houseRentAllowance) {
        super(name, basicSalary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    // Overriding getSalary() method to calculate manager's salary with allowances
    @Override
    public double getSalary() {
        return basicSalary + travelAllowance + houseRentAllowance;
    }
}
