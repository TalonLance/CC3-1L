
import java.util.Random;

public class Dice {

    private Random r = new Random();

    public Dice() {
    }

    public int roll() {
        return 1 + r.nextInt(6);
    }

}
