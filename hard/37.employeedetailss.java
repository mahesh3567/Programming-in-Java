import java.util.ArrayList;
import java.util.Scanner;



public class employeedetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Taking input for employee details
        System.out.println("Enter details for Employee 1:");
        employeeList.add(createEmployee(scanner));

        System.out.println("Enter details for Employee 2:");
        employeeList.add(createEmployee(scanner));

        // Displaying employee details
        System.out.println("\nEmployee Details:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        // Retrieving and updating employee details
        System.out.println("\nEnter the ID of the employee to retrieve details:");
        int idToRetrieve = scanner.nextInt();
        boolean found = false;
        for (Employee employee : employeeList) {
            if (employee.getId() == idToRetrieve) {
                found = true;
                System.out.println("\nEmployee Details:");
                System.out.println("Name: " + employee.getName());
                System.out.println("ID: " + employee.getId());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("PF: " + employee.getPf());
                System.out.println("Allowance: " + employee.getAllowance());
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + idToRetrieve + " not found.");
        }

        // Removing an employee from the ArrayList
        System.out.println("\nEnter the ID of the employee to remove:");
        int idToRemove = scanner.nextInt();
        boolean removed = false;
        for (Employee employee : employeeList) {
            if (employee.getId() == idToRemove) {
                removed = true;
                employeeList.remove(employee);
                System.out.println("Employee with ID " + idToRemove + " removed successfully.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Employee with ID " + idToRemove + " not found.");
        }

        // Displaying updated employee list
        System.out.println("\nUpdated Employee Details:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        scanner.close();
    }

    private static Employee createEmployee(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter PF: ");
        double pf = scanner.nextDouble();
        System.out.print("Enter allowance: ");
        double allowance = scanner.nextDouble();
        return new Employee(name, id, salary, pf, allowance);
    }
}
class Employee {
    private String name;
    private int id;
    private double salary;
    private double pf;
    private double allowance;

    // Constructor
    public Employee(String name, int id, double salary, double pf, double allowance) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.pf = pf;
        this.allowance = allowance;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getPf() {
        return pf;
    }

    public double getAllowance() {
        return allowance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", pf=" + pf +
                ", allowance=" + allowance +
                '}';
    }
}