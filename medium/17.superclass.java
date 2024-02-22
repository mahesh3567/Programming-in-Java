import java.util.Scanner;

public class superclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();
        System.out.print("Enter value for y: ");
        int y = scanner.nextInt();
        System.out.print("Enter value for z: ");
        int z = scanner.nextInt();
        SubClass sub = new SubClass(x, y, z);
        scanner.close();
    }
}
class SuperClass {
    int x;
    int y;

    public SuperClass(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("SuperClass constructor called with x=" + x + " and y=" + y);
    }
}

class SubClass extends SuperClass {
    int z;

    public SubClass(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("SubClass constructor called with x=" + x + ", y=" + y + ", and z=" + z);
    }
}