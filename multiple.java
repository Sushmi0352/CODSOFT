import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            playRound(scanner);
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("yes");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }

    public static void playRound(Scanner scanner) {
        int randomNumber = (int) (Math.random() * 100) + 1; // Generates a random number between 1 and 100
        boolean hasGuessedCorrectly = false;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5; // Limiting the number of attempts

        System.out.println("\nWelcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts.");

        while (!hasGuessedCorrectly && attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                hasGuessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've run out of attempts! The correct number was: " + randomNumber);
        }
    }
}
