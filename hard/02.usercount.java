import java.util.Scanner;

public class usercount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total users and staff users
        System.out.print("Total Users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Staff Users: ");
        int staffUsers = scanner.nextInt();

        // Calculate student users
        int studentUsers = totalUsers - staffUsers - (staffUsers / 3);

        // Output the result
        System.out.println("\nStudent Users: " + studentUsers);
    }
}
