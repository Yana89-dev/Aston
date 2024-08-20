public class Warrior extends Hero {
    static final private int damage = 50;

    public Warrior(String name) {
        super(name);
    }

    public Warrior() {
        super("Warrior");
    }

    @Override
    protected void attackEnemy(Enemy enemy) {
        if (!this.isAlive()) return;
        System.out.println("Warrior " + this.getName() + " attacks enemy" );
        if (enemy.isAlive()){
            enemy.takeDamage(damage, this);
            System.out.println("The enemy has health " + enemy.getHealth());
        }
        else {
            System.out.println("The enemy has already been killed");
        }
    }
}
