public class fibonaccireverseOrder {
    public static void main(String[] args) {
        // Thread for Fibonacci series
        Thread fibonacciThread = new Thread(() -> {
            System.out.println("Fibonacci Series:");
            int n1 = 0, n2 = 1, n3, count = 10;
            System.out.print(n1 + " " + n2);
            for (int i = 2; i < count; ++i) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
            System.out.println();
        });

        // Thread for numbers from 10 to 1 in reverse order
        Thread reverseOrderThread = new Thread(() -> {
            System.out.println("Numbers from 10 to 1 in Reverse Order:");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        });

        // Start the threads
        fibonacciThread.start();
        reverseOrderThread.start();
    }
}
