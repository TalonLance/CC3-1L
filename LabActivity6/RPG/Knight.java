
public class Knight extends Character {

    public Knight(String n, int s, int d, int i) {
        super(n, s, d, i);
    }

    Dice dice = new Dice();
    private int maxStamina;
    int swordSlash;
    int currentStamina;
    int currentArmor;

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

    public int attack() {
        this.attack = this.getStrength() + (dice.roll() + 1);
        return attack;
    }

    public int useWeapon() {
        this.attack = this.getStrength() + (dice.roll());
        return attack;
    }

    public int getCurrentArmor() {
        return currentArmor;
    }

    public void setCurrentArmor(int currentArmor) {
        this.currentArmor = currentArmor;
    }

    public int useArmor() {
        int armor = this.getStrength() + (dice.roll());
        this.heal(armor);
        this.currentArmor -= 2;
        return this.currentLife;
    }

}
