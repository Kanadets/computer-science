package Cat.src;

// Made by Dmitrii Fomin


import java.util.Scanner;

public class CatClimbing {
    public static void main(String[] args)
    {
        boolean running = true; // Variable to control the main loop
        String pressedBtn; // Variable to store the user's input

        
        Cat cat = new Cat(); // Create a new Cat object
        Scanner scan  = new Scanner(System.in); // Create a Scanner object for user input

        // Welcome message and print the initial state of the cat
        System.out.println("Welcome to the Cat");
        System.out.println("Initial state:");
        System.out.println(cat);

        // Main loop
        while (running)
        {
            System.out.print("Enter command (Climb (C), Reverse (R), Output (O), Exit (E)): ");
            pressedBtn = scan.nextLine(); // Read the user's input

            // Handle user input
            switch (pressedBtn.toLowerCase())
            {
                case "c":
                    if (!cat.canClimbDig())
                        System.out.println("You cannot dig under the ground");
                    else
                    {
                        cat.climb();
                        
                        System.out.println("Climbed " + cat.getCurrentDirection());
                    }

                    break;
                case "r":
                    cat.reverse(); // Reverse the cat's climbing direction
                    System.out.println("Reversed, new direction is " + cat.getCurrentDirection());
                    break;
                case "o":
                    System.out.println("Your current state: ");
                    System.out.println(cat); // Print the current state of the cat
                    break;
                case "e":
                    System.out.println("Thank you for using Cat. Your last state:");
                    System.out.println(cat); // Print the final state of the cat
                    System.out.println("Exiting program...");
                    running = false; // Exit the loop and terminate the program
                    break;
                default:
                    System.out.println("Invalid command. Please enter C, R, O, or E.");
            }
        }
    }
}