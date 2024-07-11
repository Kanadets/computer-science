// Made by Dmitrii Fomin

// Implemented a class called ArrayOps, which has a character array. The constructor receives a parameter,
// which is the size of the array to be dynamically allocated in the constructor,
// then populates that array with random characters from the range ‘a’ through ‘z’.
// Methods are required to return the lowest value and highest value,
// as well as a String representation of the array values.

package ArrayOps;

import java.util.Random;

public class ArrayOps {
    private char[] charArray;

    Random rand = new Random();

    // Constructor to initialize the array with random characters
    public ArrayOps(int size)
    {
        charArray = new char[size];

        for (int i = 0; i < size; i++)
        {
           charArray[i] = (char) ('a' + rand.nextInt(26)); // // Generate random character 'a' to 'z'
        }
    }

    // Method to find the lowest value in the array
    public char getLowestValue()
    {
        char lowest = charArray[0];

        for (int i = 1; i < charArray.length; i++)
        {
            if(charArray[i] < lowest)
            {
                lowest = charArray[i];
            }
        }

        return lowest;
    }

    // Method to find the highest value in the array
    public char getHighestValue()
    {
        char highest = charArray[0];

        for (int i = 1; i < charArray.length; i++)
        {
            if(charArray[i] > highest)
            {
                highest = charArray[i];
            }
        }

        return highest;
    }

    // Method to get a String representation of the array
    public String toString()
    {
        String result = "";

        for (char c : charArray) {
            result += c + " ";
        }

        return result;
    }
}
