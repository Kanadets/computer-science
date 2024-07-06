public class Cat
{
    private int position;
    private boolean isClimbingUp;

    public Cat()
    {
        position = 0;
        isClimbingUp = true;
    }

    public void climb()
    {
        if (isClimbingUp)
            position++;

        if (!isClimbingUp && position > 0)
            position--;
    }

    public boolean canClimbDig()
    {
        return isClimbingUp || position != 0;
    }

    public String getCurrentDirection()
    {
        return isClimbingUp ? "up" : "down";
    }

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
