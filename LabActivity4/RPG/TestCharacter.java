
public class TestCharacter {

    public static void main(String[] args) {

        Character character1 = new Character("Jack", 10, 5, 3);
        character1.setMaxLife(20);

        Character character2 = new Character("Jill", 10, 5, 3);
        character2.setMaxLife(20);

        int round;
        for (round = 1; character1.currentLife > 0 || character2.currentLife > 0; round++) {
            System.out.println("ROUND " + round);

            System.out.println(character1.getName() + ": " + character1.getCurrentLife() + "\n"
                    + character2.getName() + ": " + character2.getCurrentLife());

            character1.attack();
            int attack1 = character1.attack;
            character2.wound(character1.attack());
            character2.attack();
            int attack2 = character2.attack;
            character1.wound(character2.attack());

            System.out.println(character1.getName() + " attacked " + character2.getName() + " for " + attack1);
            System.out.println(character2.getName() + " attacked " + character1.getName() + " for " + attack2);

            if (character1.currentLife > 0 && character2.currentLife <= 0) {
                System.out.println(character1.getName() + " wins!");
                break;
            } else if (character2.currentLife > 0 && character1.currentLife <= 0) {
                System.out.println(character2.getName() + " wins!");
                break;
            } else if (character1.currentLife <= 0 && character2.currentLife <= 0) {
                System.out.println("It's a tie!");
                break;
            } else if (character1.currentLife > 0 && character2.currentLife > 0) {

                character1.potion();
                int heal1 = character1.potion;
                character1.heal(heal1);
                character2.potion();
                int heal2 = character2.potion;
                character2.heal(heal2);

                System.out.println(character1.getName() + " healed for " + heal1);
                System.out.println(character2.getName() + " healed  for " + heal2);

            }

        }

    }

}
