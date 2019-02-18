
public class Character {

    private Dice dice = new Dice();

    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int maxLife;
    int currentLife;
    int attack;
    int potion;

    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife + (dice.roll() + 1);
        this.currentLife = this.maxLife;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public int attack() {
        this.attack = this.strength + (dice.roll() + 1);
        return attack;
    }

    public void wound(int damage) {
        this.currentLife -= damage;
    }

    public int potion() {
        this.potion = dice.roll() + 1 + this.dexterity;
        return potion;
    }

    public void heal(int heal) {
        this.currentLife += heal;
    }

}
