import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Mark");
        warrior.setHealth(300);
        Hero mage = new Mage("Aramis");
        warrior.setHealth(200);
        Hero archer= new Archer("Dallas");
        Enemy zombie = new Zombie(300);
        Enemy witch = new Witch(500);

        List<Hero> heroes = new ArrayList<>();
        heroes.add(warrior);
        heroes.add(mage);
        heroes.add(archer);

        while (archer.isAlive()||warrior.isAlive()||mage.isAlive()) {
            for (Hero hero : heroes) {

                hero.attackEnemy(zombie);
                witch.attackHero(hero);
                hero.attackEnemy(witch);
                zombie.attackHero(hero);
            }
        }

    }
}
