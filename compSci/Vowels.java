

import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args)
    {
        int countA = 0,
            countE = 0,
            countI = 0,
            countO = 0,
            countU = 0,
            countNonVowels = 0;
        boolean keepRunning = true;
        String userInput, response;

        Scanner scan = new Scanner(System.in);

        while (keepRunning)
        {
            System.out.print("Enter some text: ");
            userInput = scan.nextLine();

            for (int i = 0; i < userInput.length(); i++) {
                char ch = userInput.charAt(i);

                switch (Character.toLowerCase(ch)) {
                    case 'a':
                        countA++;
                        break;
                    case 'e':
                        countE++;
                        break;
                    case 'i':
                        countI++;
                        break;
                    case 'o':
                        countO++;
                        break;
                    case 'u':
                        countU++;
                        break;
                    default:
                        countNonVowels++;
                        break;
                }
            }

            System.out.println("Number of 'a' characters: " + countA);
            System.out.println("Number of 'e' characters: " + countE);
            System.out.println("Number of 'i' characters: " + countI);
            System.out.println("Number of 'o' characters: " + countO);
            System.out.println("Number of 'u' characters: " + countU);
            System.out.println("Number of non-vowel characters: " + countNonVowels);

            System.out.print("Do you want to enter another text? (yes/no): ");
            response = scan.nextLine();

            if (!response.equalsIgnoreCase("yes"))
            {
                keepRunning = false;
            }
        }
    }
}
