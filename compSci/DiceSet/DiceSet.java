// Made by Dmitrii Fomin

// This class simulates a set of multiple dice. The design stores 1 to N objects
// of the Die class using a one-dimensional array.
// The constructor dynamically allocates the number of dice needed based
// on a parameter. It includes a method to roll all the dice in the set
// and a toString to show the contents of the set.

package DiceSet;

public class DiceSet
{
    private Die[] diceSet;

    // Constructor to dynamically allocate number of dice
    public DiceSet(int numDice)
    {
        diceSet = new Die[numDice];

        for (int i = 0; i < numDice; i++)
            diceSet[i] = new Die();
    }

    // Rolls all dice in the set
    public void rollAll()
    {
        for (Die die : diceSet)
            die.roll();
    }

    // Method to get a String representation of the dice set
    public String toString()
    {
        String result = "";

        for (int i = 0; i < diceSet.length; i++)
            result += "Die " + (i + 1) + ": " + diceSet[i] + "\n";

        return result;
    }
}
