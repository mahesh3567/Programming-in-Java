import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter register number: ");
        int registerNumber = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter five subject marks separated by space: ");
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }
        scanner.close();
        Student student = new Student(name, registerNumber, marks);
        student.displayMarksAndAverage();
    }

}

class Student {

    private String name;
    private int registerNumber;
    private int[] marks;

    public Student(String name, int registerNumber, int... marks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.marks = marks;
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        this.average = (double) total / marks.length;
    }

    private double average;

    public void displayMarksAndAverage() {
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.printf("\nAverage: %.2f%n", average);
    }

}