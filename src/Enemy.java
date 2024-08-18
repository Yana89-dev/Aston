public class Enemy implements Mortal {
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

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attackEnemy(Hero hero){};

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
