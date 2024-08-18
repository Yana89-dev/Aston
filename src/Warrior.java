public class Warrior extends Hero {
    public Warrior(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior attacks enemy");
        enemy.takeDamage(50);
        System.out.println("The enemy has health " + enemy.getHealth());
    }
}
