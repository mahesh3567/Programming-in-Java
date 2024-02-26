import java.util.Scanner;

public class Directory {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private int uniqueIDNo;

    public Directory(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, int uniqueIDNo) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueIDNo = uniqueIDNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public int getUniqueIDNo() {
        return uniqueIDNo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter telephone number (with STD code): ");
        String telephoneNumber = scanner.nextLine();
        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();
        System.out.print("Enter head of the family: ");
        String headOfFamily = scanner.nextLine();
        System.out.print("Enter unique ID no.: ");
        int uniqueIDNo = scanner.nextInt();
        Directory directory = new Directory(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueIDNo);
        System.out.println("Example 1:");
        System.out.println("Input:");
        System.out.println("Name: " + directory.getName());
        System.out.println("Address: " + directory.getAddress());
        System.out.println("Telephone Number: " + directory.getTelephoneNumber());
        System.out.println("Mobile Number: " + directory.getMobileNumber());
        System.out.println("Head of the Family: " + directory.getHeadOfFamily());
        System.out.println("Unique ID No.: " + directory.getUniqueIDNo());
    }
}