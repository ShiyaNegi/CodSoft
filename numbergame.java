
import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1; // Define the lower bound of the number range
        int upperBound = 100; // Define the upper bound of the number range
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please guess within the valid range.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}


