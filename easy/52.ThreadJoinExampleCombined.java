class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread (Thread class) " + Thread.currentThread().getId() + " is running.");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread (Runnable interface) " + Thread.currentThread().getId() + " is running.");
    }
}

public class ThreadJoinExampleCombined {
    public static void main(String[] args) {
        int numOfThreads = 5;

        for (int i = 0; i < numOfThreads; i++) {
            MyThread thread1 = new MyThread();
            thread1.start();

            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread thread2 = new Thread(new MyRunnable());
            thread2.start();

            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
