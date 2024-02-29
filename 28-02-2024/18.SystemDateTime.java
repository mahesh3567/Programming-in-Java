import java.util.Date;
import java.time.LocalDateTime;

public class SystemDateTime {

    public static void main(String[] args) {
        // Using java.util.Date
        Date currentDate = new Date();
        System.out.println("Current System Date and Time: " + currentDate);

        // Using java.time.LocalDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current System Date and Time: " + currentDateTime);
    }
}
