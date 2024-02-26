import java.util.Scanner;



public class ThreadPriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name for Thread 1: ");
        String thread1Name = scanner.nextLine();
        System.out.print("Enter the name for Thread 2: ");
        String thread2Name = scanner.nextLine();

        PriorityThread thread1 = new PriorityThread(thread1Name);
        PriorityThread thread2 = new PriorityThread(thread2Name);

        // Set priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Highest priority

        thread1.start();
        thread2.start();

        scanner.close();
    }
}
class PriorityThread extends Thread {
    private String name;

    public PriorityThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " executing iteration " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " finished.");
    }
}
