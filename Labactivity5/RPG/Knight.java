
public class Knight extends Character {

    public Knight(String n, int s, int d, int i) {
        super(n, s, d, i);
    }

    Dice dice = new Dice();
    private int maxStamina;
    int swordSlash;
    int currentStamina;

    public int swingSword() {
        this.swordSlash = this.getStrength() + this.getDexterity() + (dice.roll() + 1);
        this.currentStamina -= 2;
        return swordSlash;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina + (dice.roll() + 1);
        this.currentStamina = this.maxStamina;
    }

    public int getCurrentStamina() {
        return currentStamina;
    }

}
