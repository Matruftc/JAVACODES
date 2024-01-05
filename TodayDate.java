import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayDate{

    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();

        // Format the date (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);

        System.out.println("Today's Date: " + formattedDate);
    }
}