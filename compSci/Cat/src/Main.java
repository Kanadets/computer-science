package Cat.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        boolean running = true;
        String pressedBtn;

        Cat cat = new Cat();
        Scanner scan  = new Scanner(System.in);

        System.out.println("Welcome to the Cat");
        System.out.println("Initial state:");
        System.out.println(cat);

        while (running)
        {
            System.out.print("Enter command (Climb (C), Reverse (R), Output (O), Exit (E)): ");
            pressedBtn = scan.nextLine();

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
                    cat.reverse();
                    System.out.println("Reversed, new direction is " + cat.getCurrentDirection());
                    break;
                case "o":
                    System.out.println("Your current state: ");
                    System.out.println(cat);
                    break;
                case "e":
                    System.out.println("Thank you for using Cat. Your last state:");
                    System.out.println(cat);
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please enter C, R, O, or E.");
            }
        }
    }
}