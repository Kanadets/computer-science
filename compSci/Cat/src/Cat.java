package Cat.src;

// This class is called Cat, which represents a cat climbing a vertical utility pole. 
// The cat can only climb for one unit of distance at a time. 
// The direction in which it is climbing can be either up or down. 
// The cat can decide to change direction (i.e., if it was climbing up, 
// then it will now be climbing down; and vice-versa).

public class Cat
{
    private int position; // Tracks the current position of the cat
    private boolean isClimbingUp; // Indicates if the cat is climbing up (true) or down (false)

    // Constructor initializes the cat's position and sets the climbing direction to up
    public Cat()
    {
        position = 0;
        isClimbingUp = true;
    }

     // Method to handle the cat climbing
    public void climb()
    {
        if (isClimbingUp)
            position++;

        if (!isClimbingUp && position > 0)
            position--;
    }

    // Method to check if the cat can climb or dig, 
    // by default canClimbDig will return true if direction is up
    public boolean canClimbDig()
    {
        return isClimbingUp || position != 0;
    }

    // Method to get the current climbing direction of the cat
    public String getCurrentDirection()
    {
        return isClimbingUp ? "up" : "down";
    }

    // Method to reverse the climbing direction of the cat
    public void reverse()
    {
        isClimbingUp = !isClimbingUp;
    }

    public String toString()
    {
        String direction = isClimbingUp ? "up" : "down";

        return "Position: " + position + ", Climbing direction: " + direction;
    }
}
