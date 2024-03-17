import java.util.Random;
import java.util.Scanner;

public class correctGuessNumber {
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

        // Loop until the user guesses the correct number
        while (true) {
            // Prompt the user to enter their guess
            System.out.println("Guess the number between " + min + " and " + max + ": ");
            int userGuess = scanner.nextInt();

            // Check if the user's guess is correct
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                break; // Exit the loop if the guess is correct
            } else if (userGuess < randomNumber) {
                System.out.println("The number is greater than or equal to your guess. Try again!");
            } else {
                System.out.println("The number is smaller than or equal to your guess. Try again!");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}
