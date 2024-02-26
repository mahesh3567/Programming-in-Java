public class ThreadExample2 {
    public static void main(String[] args) {
        // Creating two threads
        Thread thread1 = new MyThread("Thread 1", 10000);
        Thread thread2 = new MyThread("Thread 2", 5000);

        // Starting the threads
        thread1.start();
        thread2.start();

        // Joining the threads if they contain even numbers
        try {
            if (thread1 instanceof MyThread && thread2 instanceof MyThread) {
                MyThread t1 = (MyThread) thread1;
                MyThread t2 = (MyThread) thread2;
                if (t1.containsEvenNumber() && t2.containsEvenNumber()) {
                    thread1.join();
                    thread2.join();
                    System.out.println("Both threads contain even numbers. Joined them.");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Custom thread class
    static class MyThread extends Thread {
        private final String name;
        private final int sleepTime;

        public MyThread(String name, int sleepTime) {
            this.name = name;
            this.sleepTime = sleepTime;
        }

        @Override
        public void run() {
            System.out.println(name + " started.");
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " finished.");
        }

        // Method to check if the thread contains even numbers
        public boolean containsEvenNumber() {
            return sleepTime % 2 == 0;
        }
    }
}
