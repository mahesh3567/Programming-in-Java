public class ThreadExample extends Thread {
    
    // Thread for Armstrong numbers
    static class ArmstrongThread extends Thread {
        @Override
        public void run() {
            System.out.println("ArmstrongThread: STARTED");
            for (int i = 1; i <= 1000; i++) {
                if (isArmstrong(i)) {
                    System.out.println("ArmstrongThread: Armstrong number found: " + i);
                }
            }
            System.out.println("ArmstrongThread: COMPLETED");
        }
        
        // Check if a number is Armstrong
        private boolean isArmstrong(int num) {
            int originalNum, remainder, result = 0, n = 0;
            originalNum = num;
            for (;originalNum != 0; originalNum /= 10, ++n);
            originalNum = num;
            for (;originalNum != 0; originalNum /= 10) {
                remainder = originalNum % 10;
                result += Math.pow(remainder, n);
            }
            return result == num;
        }
    }
    
    // Thread for Fibonacci series
    static class FibonacciThread extends Thread {
        @Override
        public void run() {
            System.out.println("FibonacciThread: STARTED");
            int n = 10, t1 = 0, t2 = 1;
            System.out.print("FibonacciThread: First " + n + " terms: ");
            for (int i = 1; i <= n; ++i) {
                System.out.print(t1 + " + ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
            System.out.println("...");
            System.out.println("FibonacciThread: COMPLETED");
        }
    }
    
    // Main method
    public static void main(String[] args) {
        // Creating and starting threads
        ArmstrongThread t1 = new ArmstrongThread();
        FibonacciThread t2 = new FibonacciThread();
        
        t1.start();
        t2.start();
    }
}
