public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Mark");
        warrior.setHealth(300);
        Hero mage = new Mage("Aramis");
        warrior.setHealth(200);
        Hero archer= new Archer("Dallas");
        Enemy zombie = new Zombie(300);
        Enemy witch = new Witch(500);

        int count = 0;
        while (count<=15){
            warrior.attackEnemy(zombie);
            count++;
        }

        while (archer.isAlive()){
            zombie.attackHero(archer);
        }

    }
}
