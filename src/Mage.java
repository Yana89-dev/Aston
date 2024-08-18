public class Mage extends Hero {
    public Mage(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage attacks enemy");
        enemy.takeDamage(30);
        System.out.println("The enemy has health " + enemy.getHealth());
    }
}
