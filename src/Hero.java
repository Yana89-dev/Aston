abstract public class Hero implements Mortal {
    private String name;
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Hero(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
