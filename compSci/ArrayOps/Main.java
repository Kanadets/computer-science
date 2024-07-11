// Made by Dmitrii Fomin

package ArrayOps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int size;
        char lowest, highest;

        Scanner scan = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the size of the array: ");
        size = scan.nextInt();

        // Create an ArrayOps object with the specified size
        ArrayOps arrayOps = new ArrayOps(size);

        // Display array contents
        System.out.println("Array contents: " + arrayOps);

        // Display lowest and highest values
        lowest = arrayOps.getLowestValue();
        highest = arrayOps.getHighestValue();

        System.out.println("Lowest value: " + lowest);
        System.out.println("Highest value: " + highest);
    }
}
