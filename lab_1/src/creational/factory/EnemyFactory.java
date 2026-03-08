package creational.factory;

public class EnemyFactory {
    public Enemy spawnEnemy(int playerLevel){
        if(playerLevel < 5){
            return new Orc();
        }else if (playerLevel >= 5 && playerLevel < 15){
            return new Ghost();
        }else{
            return new Orc();
        }
    }
}
