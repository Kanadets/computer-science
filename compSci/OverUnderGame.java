// Made by Dmitrii Fomin

// This is an application that plays the Over-Under guessing game with numbers.
// The program picks a random number between 1 and 100 (inclusive),
// then repeatedly prompt the user to guess the number.
// On each guess, reports to the user that they are correct or that the guess
// is over or under the target random number. It continues accepting guesses until
// the user guesses correctly or chooses to quit. Count the number of guesses and report
// that value when the user guesses correctly. If a guess is out of the range 1 to 100,
// an appropriate message should be displayed to the user and the guess not be counted.
// At the end of each game (by quitting or a correct guess), prompt to determine whether
// the user wants to play again. Continue playing another game until the user chooses to stop.

import java.util.*;

public class OverUnderGame
{
    static public void main(String[] args)
    {
        int targetNumber, guessCount = 0;
        String userInput, playAgain;
        // Variable to control whether to play another game (keep playing),
        // and flag to indicate whether the correct number has been guessed (correctGuess)
        boolean keepPlaying = true, correctGuess = false;

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        // Generate a random number between 1 and 100 (inclusive)
        targetNumber = generator.nextInt(100) + 1;

        // Outer loop to continue playing until the user chooses to stop
        while(keepPlaying)
        {
            System.out.println("I have selected a number between 1 and 100.");

            // Inner loop to process each guess
            while (!correctGuess)
            {
                System.out.print("Enter your guess (or type 'quit' to exit): ");
                userInput = scan.next();

                // Check if the user wants to quit
                if (userInput.equalsIgnoreCase("quit"))
                {
                    correctGuess = true;
                    keepPlaying = false;
                    System.out.println("You chose to quit. Thanks for playing!");
                    break;
                }

                // Here I'd add a check if the user input is a valid number, but we haven't done methods/functions
                int guess = Integer.parseInt(userInput);

                if (guess < 1 || guess > 100)
                {
                    System.out.println("Please enter a number between 1 and 100.");
                }
                else
                {
                    guessCount++;

                    if (guess == targetNumber)
                    {
                        System.out.println("Congratulations! You guessed the correct number.");
                        System.out.println("It took you " + guessCount + " guesses.");
                        correctGuess = true;
                    }
                    else if (guess < targetNumber)
                    {
                        System.out.println("Your guess is too low. Try again.");
                    } else {
                        System.out.println("Your guess is too high. Try again.");
                    }
                }
            }

            if (correctGuess)
            {
                System.out.print("Do you want to play again? (yes/no): ");
                playAgain = scan.next();

                if (!playAgain.equalsIgnoreCase("yes")) {
                    keepPlaying = false;

                    System.out.println("Thanks for playing!");
                }
                else
                {
                    correctGuess = false;
                    guessCount = 0;
                    targetNumber = generator.nextInt(101);
                }
            }
        }
    }
}