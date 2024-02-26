import java.util.Scanner;


public class areavolumeofshape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Sphere");
        System.out.println("2. Cone");
        System.out.println("3. Cylinder");
        int choice = scanner.nextInt();

        Shape shape = null;
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = scanner.nextDouble();
                shape = new Sphere(sphereRadius);
                break;
            case 2:
                System.out.print("Enter the radius of the cone: ");
                double coneRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cone: ");
                double coneHeight = scanner.nextDouble();
                shape = new Cone(coneRadius, coneHeight);
                break;
            case 3:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = scanner.nextDouble();
                shape = new Cylinder(cylinderRadius, cylinderHeight);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        System.out.println("Area of the shape: " + shape.calculateArea());
        System.out.println("Volume of the shape: " + shape.calculateVolume());

        scanner.close();
    }
}
abstract class Shape {
    abstract double calculateArea();
    abstract double calculateVolume();
}

class Sphere extends Shape {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

class Cone extends Shape {
    double radius;
    double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    double calculateVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

class Cylinder extends Shape {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
