public class ThreadExample1 {
    public static void main(String[] args) {
        // Creating and starting two threads
        Thread thread1 = new Thread(new MyThread("Thread 1"));
        Thread thread2 = new Thread(new MyThread("Thread 2"));
        thread1.start();
        thread2.start();
    }

    // Custom thread class
    static class MyThread implements Runnable {
        private final String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            try {
                // Perform some operation in the thread
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println(name + " has completed execution. Total sleeping/waiting time: " + elapsedTime + " milliseconds");
        }
    }
}
