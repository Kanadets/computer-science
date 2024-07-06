public class Die
{
    private final int DEFAULT_MAX = 6; // default maximum face value

    private int maxFaceValue; // maximum face value for the die
    private int faceValue; // current face value

    public Die() {
        maxFaceValue = DEFAULT_MAX;
        faceValue = 1;
    }

    // Constructor for a die with a specified number of faces
    public Die(int faces) {
        if (faces == 4 || faces == 6 || faces == 8 || faces == 12 || faces == 20) {
            maxFaceValue = faces;
        } else {
            maxFaceValue = DEFAULT_MAX; // default to 6-sided die if invalid
        }
        faceValue = 1;
    }

    public void roll()
    {
        faceValue = (int) (Math.random() * maxFaceValue) + 1;
    }

    public void setFaceValue(int value)
    {
        if (value < 0 && value <= maxFaceValue)
        {
            faceValue = value;
        }
    }

    public int getFaceValue()
    {
        return faceValue;
    }

    // Method to get the textual name of the face value, not ideal solution,
    // I'd use hashmap, but we didn't touch that topic yet
    public String getFaceName() {
        switch (faceValue) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
            case 20: return "Twenty";
            default: return "Invalid";
        }
    }

    // toString method to return the numeric and textual face value
    public String toString() {
        return faceValue + " : " + getFaceName();
    }
}
