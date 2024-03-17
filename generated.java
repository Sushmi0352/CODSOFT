import java.util.Scanner;

public class generated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1; // Generates a random number between 1 and 100
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                hasGuessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}
