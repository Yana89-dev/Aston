public class Archer extends Hero {
    static final private int damage = 10;

    public Archer(String name) {
        super(name);
    }

    public Archer() {
        super("Archer");
    }

    @Override
    protected void attackEnemy(Enemy enemy) {
        if (!this.isAlive()) return;
        if (enemy.isAlive()){
            System.out.println("Archer " + this.getName() + " attacks enemy" );
            enemy.takeDamage(damage, this);
            System.out.println("The enemy has health " + enemy.getHealth());
        }
        else {
            System.out.println("The enemy has already been killed");
        }
    }
}
