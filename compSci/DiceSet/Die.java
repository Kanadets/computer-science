// Made by Dmitrii Fomin

package DiceSet;

public class Die
{
    private final int MAX = 6; // The maximum value of a die
    private final String[] FACE_NAMES = {"One", "Two", "Three", "Four", "Five", "Six"}; // names corresponding to face values

    private int faceValue; // The current value of the die

    public Die()
    {
        faceValue = 1; // initial face value set to 1
    }

    // Rolls the die to generate a random face value between 1 and 6 (inclusive).
    public int roll()
    {
        faceValue = (int)(Math.random() * MAX) + 1;

        return faceValue;
    }

    public void setFaceValue(int value)
    {
        if (value > 0 && value <= MAX)
            faceValue = value;
    }

    public int getFaceValue()
    {
        return faceValue;
    }

    // Returns a string representation of the die, showing its current face value and its name.
    public String toString()
    {
        return faceValue + ": " + FACE_NAMES[faceValue - 1];
    }
}
