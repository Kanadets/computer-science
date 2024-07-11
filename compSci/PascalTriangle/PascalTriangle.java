// Made by Dmitrii Fomin
//
// This program demonstrates a recursive approach to compute and print Pascal's Triangle up to the Nth line.
// Each interior value in the triangle is the sum of the two values directly above it.

package PascalTriangle;

public class PascalTriangle
{
    // Recursive method to calculate the value at row r and column c
    // T(r, 0) = T(r, r) = 1
    // T(r, c) = T(r - 1, c - 1) + T(r - 1, c)
    public static int getPascalValue(int r, int c)
    {
        if(r == c || c == 0)
        {
            return 1;
        }

        return getPascalValue(r - 1, c - 1) + getPascalValue(r - 1, c);
    }

    // Method to print Pascal's Triangle up to n rows
    public static void printPascalsTriangle(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(getPascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }
}
