// Made by Dmitrii Fomin

package PascalTriangle;

public class Main
{
    public static void main(String[] args)
    {
        // Test case 1: Print Pascal's Triangle up to 5 rows
        System.out.println("Pascal's Triangle with 5 rows:");
        PascalTriangle.printPascalsTriangle(4);
        System.out.println();

        // Test case 2: Print Pascal's Triangle up to 7 rows
        System.out.println("Pascal's Triangle with 7 rows:");
        PascalTriangle.printPascalsTriangle(7);
        System.out.println();

        // Test case 3: Print Pascal's Triangle up to 10 rows
        System.out.println("Pascal's Triangle with 10 rows:");
        PascalTriangle.printPascalsTriangle(10);

        // Test case 3: Print Pascal's Triangle up to 20 rows
        System.out.println("Pascal's Triangle with 20 rows:");
        PascalTriangle.printPascalsTriangle(20);
    }
}
