import java.util.Scanner;
import java.util.Vector;

// Student class representing student information

// Main class
public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Student> students = new Vector<>();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Insert a student record");
            System.out.println("2. Retrieve a student record");
            System.out.println("3. Remove a student record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    insertStudentRecord(scanner, students);
                    break;
                case 2:
                    retrieveStudentRecord(scanner, students);
                    break;
                case 3:
                    removeStudentRecord(scanner, students);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    // Method to insert a student record
    private static void insertStudentRecord(Scanner scanner, Vector<Student> students) {
        System.out.println("\nEnter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Course: ");
        String course = scanner.nextLine();
        System.out.print("Contact Information: ");
        String contactInfo = scanner.nextLine();

        Student student = new Student(name, rollNumber, department, course, contactInfo);
        students.add(student);
        System.out.println("Student record inserted successfully.");
    }

    // Method to retrieve a student record
    private static void retrieveStudentRecord(Scanner scanner, Vector<Student> students) {
        System.out.print("\nEnter roll number to retrieve student record: ");
        int rollNumber = scanner.nextInt();
        boolean found = false;

        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                student.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student record not found for roll number: " + rollNumber);
        }
    }

    // Method to remove a student record
    private static void removeStudentRecord(Scanner scanner, Vector<Student> students) {
        System.out.print("\nEnter roll number to remove student record: ");
        int rollNumber = scanner.nextInt();
        boolean removed = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                students.remove(i);
                System.out.println("Student record removed successfully for roll number: " + rollNumber);
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Student record not found for roll number: " + rollNumber);
        }
    }
}
class Student {
    private String name;
    private int rollNumber;
    private String department;
    private String course;
    private String contactInfo;

    // Constructor
    public Student(String name, int rollNumber, String department, String course, String contactInfo) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.course = course;
        this.contactInfo = contactInfo;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getCourse() {
        return course;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    // Method to display student information
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
        System.out.println("Course: " + course);
        System.out.println("Contact Information: " + contactInfo);
    }
}
