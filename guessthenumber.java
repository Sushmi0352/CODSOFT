import java.util.Random;
import java.util.Scanner;

public class guessthenumber {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create an instance of Random class
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their guess
        System.out.println("Guess the number between " + min + " and " + max + ": ");
        int userGuess = scanner.nextInt();

        // Check if the user's guess is correct
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
        } else {
            System.out.println("Sorry, the correct number was: " + randomNumber);
        }

        // Close the Scanner
        scanner.close();
    }
}

