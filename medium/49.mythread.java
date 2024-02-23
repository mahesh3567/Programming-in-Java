class MyThread extends Thread {
    MyThread() {
        super(); // Calls Thread class constructor
        start(); // Start the thread
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted.");
            }
        }
        System.out.println("Child Thread exiting.");
    }
}

public class mythread {
    public static void main(String[] args) {
        MyThread mt = new MyThread(); // Creating an instance of MyThread

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000); // Pause for 1000 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main Thread exiting.");
    }
}
