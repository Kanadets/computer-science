package ArrayOps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an ArrayOps object with the specified size
        ArrayOps arrayOps = new ArrayOps(size);

        // Display array contents
        System.out.println("Array contents: " + arrayOps);

        // Display lowest and highest values
        char lowest = arrayOps.getLowestValue();
        char highest = arrayOps.getHighestValue();
        System.out.println("Lowest value: " + lowest);
        System.out.println("Highest value: " + highest);

        scanner.close();
    }
}
