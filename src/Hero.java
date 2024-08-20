abstract public class Hero implements Mortal {
    private String name;
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Hero(String name) {
        this.name = name;
        this.health = 300;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        if (health < damage)
            health = 0;
        else
            health -= damage;
    }

    protected abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
