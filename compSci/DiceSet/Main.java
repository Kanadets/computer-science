// Made by Dmitrii Fomin

package DiceSet;

public class Main
{
    public static void main(String[] args)
    {
        // Create different size sets
        DiceSet set1 = new DiceSet(1);
        DiceSet set2 = new DiceSet(2);
        DiceSet set5 = new DiceSet(5);

        // Roll a set of 1 10 times and display the results
        System.out.println("Rolling 1 die 10 times:");
        for (int i = 0; i < 10; i++)
        {
            set1.rollAll();
            System.out.println("Roll #" + (i + 1));
            System.out.println(set1);
        }

        System.out.println("-----------------------------------");

        // Roll a set of 2 10 times and display the results
        System.out.println("Rolling 2 dice 10 times:");
        for (int i = 0; i < 10; i++)
        {
            set2.rollAll();
            System.out.println("Roll #" + (i + 1));
            System.out.println(set2);
        }

        System.out.println("-----------------------------------");

        // Roll a set of 5 10 times and display the results
        System.out.println("Rolling 5 dice 10 times:");
        for (int i = 0; i < 10; i++)
        {
            set5.rollAll();
            System.out.println("Roll #" + (i + 1));
            System.out.println(set5);
        }
    }
}
