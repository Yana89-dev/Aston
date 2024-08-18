public class Archer extends Hero {
    public Archer(int health) {
        super(health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attacks enemy");
        enemy.takeDamage(10);
        System.out.println("The enemy has health " + enemy.getHealth());
    }
}
