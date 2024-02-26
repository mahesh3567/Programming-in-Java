import java.util.Scanner;

public class BaseNeg2Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array 1
        System.out.print("Enter the number of elements in arr1: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of arr1 (0s and 1s from MSB to LSB):");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        // Input array 2
        System.out.print("Enter the number of elements in arr2: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of arr2 (0s and 1s from MSB to LSB):");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        // Calculate and print the result of addition
        int[] result = addBaseNeg2(arr1, arr2);
        System.out.print("Result of addition: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }

    public static int[] addBaseNeg2(int[] arr1, int[] arr2) {
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += arr1[i--];
            }
            if (j >= 0) {
                carry += arr2[j--];
            }
            sb.append((char) (carry & 1 + '0'));
            carry = -(carry >> 1);
        }

        return reverse(sb.toString());
    }

    private static int[] reverse(String str) {
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        return result;
    }
}
