import java.util.Random;

public class random {

    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomNumber = random.nextInt(100);

        System.out.println("Random Number: " + randomNumber);
    }
}
