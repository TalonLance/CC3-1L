
public class CharacterDuel {

    public static void main(String[] args) {

        Dice dice = new Dice();

        Wizard wiz = new Wizard("Wizard", 10, 5, 3);
        wiz.setMaxLife(20);
        wiz.setMaxMagic(50);
        wiz.setCurrentArmor(30);

        Knight knight = new Knight("Knight", 10, 5, 3);
        knight.setMaxLife(20);
        knight.setMaxStamina(20);
        knight.setCurrentArmor(40);

        int round;
        for (round = 1; wiz.currentLife > 0 || knight.currentLife > 0; round++) {
            System.out.println("ROUND " + round);

            System.out.println(wiz.getName() + ": " + wiz.getCurrentLife() + "\n"
                    + knight.getName() + ": " + knight.getCurrentLife());

            int roll = dice.roll();

            if (roll == 1 || roll == 2) {
                wiz.attack();
                int attack1 = wiz.attack;
                knight.wound(wiz.attack());
                System.out.println(wiz.getName() + " attacked " + knight.getName() + " for " + attack1);
            } else if (roll == 3 || roll == 4) {
                wiz.useWeapon();
                int attack1 = wiz.attack;
                knight.wound(wiz.useWeapon());
                System.out.println(wiz.getName() + " attacked " + knight.getName() + " with a weapon for " + attack1);
                if (knight.currentArmor <= 0) {
                    System.out.println(wiz.getName() + " has broken " + knight.getName() + "'s armor!");
                } else {
                    knight.useArmor();
                }
            } else if (roll == 5 || roll == 6) {
                if (wiz.currentMagic <= 0) {
                    System.out.println(wiz.getName() + " tried to cast Lightning bolt, but has no magic left.");
                } else {
                    wiz.chargeLightningBolt();
                    int charge = wiz.chargeLightningBolt();
                    wiz.castLightningBolt();
                    knight.wound(charge);
                    knight.useArmor();
                    System.out.println(wiz.getName() + " cast Lightning Bolt on " + knight.getName()
                            + " for " + charge);
                    if (knight.currentArmor <= 0) {
                        System.out.println(wiz.getName() + " has broken " + knight.getName() + "'s armor!");
                    }
                }
            }

            roll = dice.roll();

            if (roll == 1 || roll == 2) {
                knight.attack();
                int attack2 = knight.attack;
                wiz.wound(knight.attack());
                System.out.println(knight.getName() + " attacked " + wiz.getName() + " for " + attack2);
            } else if (roll == 3 || roll == 4) {
                knight.useWeapon();
                int attack2 = knight.attack;
                System.out.println(knight.getName() + " attacked " + wiz.getName() + " with a small weapon for " + attack2);
                if (wiz.currentArmor <= 0) {
                    System.out.println(knight.getName() + " breaks " + wiz.getName() + "'s armor! ");
                } else {
                    wiz.useArmor();
                }
            } else if (roll == 5 || roll == 6) {
                if (knight.currentStamina <= 0) {
                    System.out.println(knight.getName() + " tried to swing his bigger sword, but had no stamina left.");
                } else {
                    knight.swingSword();
                    int attack2 = knight.swingSword();
                    wiz.wound(attack2);
                    System.out.println(knight.getName() + " attacked " + wiz.getName() + " with a giant sword for "
                            + attack2);
                }
            }

            if (wiz.currentLife > 0 && knight.currentLife <= 0) {
                System.out.println(wiz.getName() + " wins!");
                break;
            } else if (knight.currentLife > 0 && wiz.currentLife <= 0) {
                System.out.println(knight.getName() + " wins!");
                break;
            } else if (wiz.currentLife <= 0 && knight.currentLife <= 0) {
                System.out.println("It's a tie!");
                break;
            } else if (wiz.currentLife > 0 && knight.currentLife > 0) {

                roll = dice.roll();
                int heal1 = 0;

                if (wiz.currentLife < wiz.getMaxLife()) {
                    if (roll <= 3) {
                        wiz.potion();
                        heal1 = wiz.potion;
                        wiz.heal(heal1);
                        if (wiz.currentLife > wiz.getMaxLife()) {
                            while (wiz.currentLife > wiz.getMaxLife()) {
                                wiz.currentLife--;
                            }
                        }
                    } else if (roll >= 4) {
                        if (wiz.currentMagic <= 0) {
                            System.out.println(wiz.getName() + " tried to cast heal, but had no magic left.");
                        } else {
                            System.out.println(wiz.getName() + " cast Heal");
                            wiz.useHeal();
                            heal1 = wiz.useHeal();
                            wiz.castHeal(heal1);
                            if (wiz.currentLife > wiz.getMaxLife()) {
                                while (wiz.currentLife > wiz.getMaxLife()) {
                                    wiz.currentLife--;
                                }
                            }
                        }
                    }
                }
                
                int heal2 = 0;
                if (knight.currentLife < knight.getMaxLife()) {
                    knight.potion();
                    heal2 = knight.potion;
                    knight.heal(heal2);
                    if (knight.currentLife > knight.getMaxLife()) {
                        while (knight.currentLife > knight.getMaxLife()) {
                            knight.currentLife--;
                        }
                    }
                }

                System.out.println(wiz.getName() + " healed for " + heal1);
                System.out.println(knight.getName() + " healed  for " + heal2);

            }

        }

    }

}
