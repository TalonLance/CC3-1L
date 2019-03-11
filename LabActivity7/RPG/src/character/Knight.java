package character;

import item.Dice;
import item.Weapon;
import item.Armor;

/**
 * Knight.java is a child class that extends the parent class Character.java and
 * implements the interfaces Weapon and Armor.
 * The program creates a basic character through the Character class then
 * promotes it into a knight by giving it a strength boost and giving it two
 * weapons to triple it's attacks. In addition to giving it a much stronger
 * armor.
 *
 * @author Lance Justin Raymond Talon
 * @version 2.0
 * @since 2019 - 02 - 18
 */
public class Knight extends Character implements Weapon, Armor {

    public Knight(String n, int s, int d, int i) {
        super(n, s, d, i);
    }

    Dice dice = new Dice();

    private int maxStamina;
    public int swordSlash;
    public int currentStamina;
    public int currentArmor;

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
