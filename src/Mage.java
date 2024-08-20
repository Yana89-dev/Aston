public class Mage extends Hero {
    static final private int damage = 30;

    public Mage(String name) {
        super(name);
    }

    public Mage() {
        super("Mage");
    }

    @Override
    protected void attackEnemy(Enemy enemy) {
        if (!this.isAlive()) return;
        System.out.println("Mage "  + this.getName() + " attacks enemy" );
        if (enemy.isAlive()){
            enemy.takeDamage(damage, this);
            System.out.println("The enemy has health " + enemy.getHealth());
        }
        else {
            System.out.println("The enemy has already been killed");
        }
    }
}
