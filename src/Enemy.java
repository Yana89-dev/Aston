public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage, Hero hero) {
        if (health < damage)
            health = 0;
        else
            health -= damage;
    }

    protected abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
