// Made by Dmitrii Fomin


// Test driver to rest Die class
public class Dice {
    public static void main(String[] args)
    {
        // Test default 6-sided die
        Die dieDefault = new Die();
        System.out.println("Rolling default 6-sided die 12 times:");
        for (int i = 0; i < 12; i++) {
            dieDefault.roll();
            System.out.println("Roll #" + (i + 1) + " | " + dieDefault);
        }

        System.out.println("----------------------------------");

        // Test 4-sided die
        Die die4 = new Die(4);
        System.out.println("Rolling 4-sided die 8 times:");
        for (int i = 0; i < 8; i++) {
            die4.roll();
            System.out.println("Roll #" + (i + 1) + " | " + die4);
        }

        System.out.println("----------------------------------");

        // Test default 6-sided die
        Die die6 = new Die();
        System.out.println("Rolling 6-sided die 12 times:");
        for (int i = 0; i < 12; i++) {
            die6.roll();
            System.out.println("Roll #" + (i + 1) + " | " + die6);
        }

        System.out.println("----------------------------------");

        // Test 8-sided die
        Die die8 = new Die(8);
        System.out.println("Rolling 8-sided die 16 times:");
        for (int i = 0; i < 16; i++) {
            die8.roll();
            System.out.println("Roll #" + (i + 1) + " | " + die8);
        }

        System.out.println("----------------------------------");

        // Test 12-sided die
        Die die12 = new Die(12);
        System.out.println("Rolling 12-sided die 24 times:");
        for (int i = 0; i < 24; i++) {
            die12.roll();
            System.out.println(die12);
        }

        System.out.println("----------------------------------");

        // Test 20-sided die
        Die die20 = new Die(20);
        System.out.println("Rolling 20-sided die 40 times:");
        for (int i = 0; i < 40; i++) {
            die20.roll();
            System.out.println("Roll #" + (i + 1) + " | " + die20);
        }

        System.out.println("----------------------------------");

        // Test invalid-sided die (default to 6-sided)
        Die invalidDie = new Die(5);
        System.out.println("Rolling invalid-sided die (default to 6-sided) 10 times:");
        for (int i = 0; i < 10; i++) {
            invalidDie.roll();
            System.out.println("Roll #" + (i + 1) + " | " + invalidDie);
        }
    }
}