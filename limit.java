import java.util.Scanner;

public class limit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 5; // Limiting the number of attempts

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                break; // End the game if the guess is correct
            } else if (userGuess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            if (attempts < maxAttempts) {
                System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've run out of attempts! The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
