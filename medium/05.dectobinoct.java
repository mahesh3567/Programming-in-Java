import java.util.Scanner;

public class dectobinoct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Decimal Number: ");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);

        System.out.println("Binary Number = " + binary);
        System.out.println("Octal = " + octal);

        scanner.close();
    }
}