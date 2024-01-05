import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class current_time {

    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Current Time: " + formattedTime);
    }
}


