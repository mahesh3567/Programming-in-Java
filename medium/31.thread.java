import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            final int index = i;
            executor.submit(() -> {
                for (int j = index; j <= 10; j += 3) {
                    System.out.println(j);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executor.shutdown();
    }

}