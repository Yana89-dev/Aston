public class Witch extends Enemy {
    static final private int damage = 50;

    public Witch(int health) {
        super(health);
    }

    public Witch() {
        super(300);
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        super.takeDamage(damage, hero);
        if (this.isAlive()){
            hero.takeDamage(10);
        }
    }

    @Override
    protected void attackHero(Hero hero) {
        if (!this.isAlive()) return;
        System.out.println("Witch attacks hero " + hero.getName());
        if (hero.isAlive()){
            hero.takeDamage(damage);
            System.out.println("The hero has health " + hero.getHealth());
        }
        else {
            System.out.println("The hero " + hero.getName() + " has already been killed");
        }
    }
}
