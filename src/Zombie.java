public class Zombie extends Enemy{
    static final private int damage = 30;
    private final int initialHealth;

    public Zombie(int health) {
        super(health);
        this.initialHealth = health;
    }

    public Zombie() {
        super(200);
        this.initialHealth = 200;
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        super.takeDamage(damage, hero);
        if (!this.isAlive()){
            this.setHealth(initialHealth);
        }

    }

    @Override
    protected void attackHero(Hero hero) {
        System.out.println("Zombie attacks hero " + hero.getName());
        if (hero.isAlive()){
            hero.takeDamage(damage);
            System.out.println("The hero has health " + hero.getHealth());
        }
        else {
            System.out.println("The hero " + hero.getName() + " has already been killed");
        }
    }
}
