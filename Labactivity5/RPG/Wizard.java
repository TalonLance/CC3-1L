
public class Wizard extends Character {

    Dice dice = new Dice();
    private int maxMagic;
    int currentMagic;
    int charge;

    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
    }

    public int getMaxMagic() {
        return maxMagic;
    }

    public void setMaxMagic(int maxMagic) {
        this.maxMagic = maxMagic + (dice.roll() + 1);
        this.currentMagic = this.maxMagic;
    }

    public int getCurrentMagic() {
        return currentMagic;
    }

    public int chargeLightningBolt() {
        this.charge = this.getStrength() + this.getIntelligence() + (dice.roll() + 1);
        return charge;
    }
    
    public void castLightningBolt() {
        this.currentMagic -= 5;
    }
    
    public int useHeal() {
        this.charge = this.getIntelligence() + this.getDexterity();
        return charge;
    }
    
    public void castHeal(int heal) {
        this.currentLife += heal;
        this.currentMagic -= 2;
    }

}
