import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class meanmedianmode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        double mean = (double) sum / size;
        System.out.println("Mean = " + (int) mean);

        Arrays.sort(array);
        int middle = size / 2;
        int median = (size % 2 == 0) ? (array[middle - 1] + array[middle]) / 2 : array[middle];
        System.out.println("Median = " + median);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;

        for (int value : array) {
            int frequency = frequencyMap.getOrDefault(value, 0) + 1;
            frequencyMap.put(value, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = value;
            }
        }

        System.out.println("Mode = " + mode);
    }
}