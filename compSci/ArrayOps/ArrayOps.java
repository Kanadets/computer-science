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

    // Method to find the lowest value (lexicographically) in the array
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

    // Method to find the highest value (lexicographically) in the array
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

    public String toString()
    {
        String result = "";

        for (char c : charArray) {
            result += c + " ";
        }

        return result;
    }
}
