
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("********************************");
        System.out.println("Welcome to the Number Guess Game");
        System.out.println("********************************");

        while (true)
        {
            int numberToGuess= (int)(Math.random()*100);
            int attempts = 0;
            rounds++;

            System.out.println("Computer thinking of a number between " + minNumber + " and " + maxNumber + ". Try to Guess it!");

            while (attempts < maxAttempts)
            {
                System.out.print("Please Enter your guess Number := ");
                int userGuess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess < numberToGuess)
                {
                    System.out.println("You Guess Number Is Too Small ===> Please Try Again");
                } else if (userGuess > numberToGuess) {
                    System.out.println("You Guess Number Is Too Large ===> Please Try Again");
                } else {
                    System.out.println("Congratulations! You guessed the number" + numberToGuess + " in " + attempts + " attempts.");
                    break;
                }
            }

            if (attempts >= maxAttempts)
            {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes"))
            {
                break;
            }
        }

        System.out.println("Game over! You played " + rounds + " rounds and took " + totalAttempts + " attempts.");
    }
}

