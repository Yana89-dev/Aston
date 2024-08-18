public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(500);
      //  Hero hero = new Hero();
      //  hero.attackEnemy(enemy);
        Warrior warrior = new Warrior(500);
        warrior.attackEnemy(enemy);
        Mage mage = new Mage(300);
        mage.attackEnemy(enemy);
        Archer archer= new Archer(200);
        archer.attackEnemy(enemy);

    }
}
