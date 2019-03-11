package item;

import java.util.Random;

/**
 * Dice.java is a class that creates a 6 sided dice with the use of the Random
 * method.
 *
 * @author Lance Justin Raymond Talon
 * @version 3.0
 * @since 2019 - 02 - 07
 */
public class Dice {

    private Random r = new Random();

    public Dice() {
    }

    public int roll() {
        return 1 + r.nextInt(6);
    }

}
