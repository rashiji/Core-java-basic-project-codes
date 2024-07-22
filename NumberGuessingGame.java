import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0;

        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1;
            System.out.println("Welcome to the Number Guessing Game!!");
            System.out.println("Guess a number between 1 and 100.");

            int attempts = 0;
            boolean guessedCorrectly = false;
            int guess;

            while (!guessedCorrectly && attempts < 10) {
                System.out.print("Enter your guess Number: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Your guess is too low.");
                } else if (guess > secretNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += 10 - attempts;
                    guessedCorrectly = true;

                }

            }
            if (!guessedCorrectly) {
                System.out.println("Sorry, you didn't guess the number. The correct number was: " + secretNumber);
            }

            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = sc.next().toLowerCase();

            if (!playChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game!!");
        sc.close();
      }
}
