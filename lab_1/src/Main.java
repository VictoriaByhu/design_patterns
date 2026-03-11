import creational.abstract_factory.FireLevelFactory;
import creational.abstract_factory.GameArea;
import creational.abstract_factory.IceLevelFactory;
import creational.abstract_factory.LevelFactory;
import creational.builder.Level;
import creational.builder.LevelBuilder;
import creational.factory.Enemy;
import creational.factory.EnemyFactory;
import creational.factory_method.DesertWorld;
import creational.factory_method.GameWorld;
import creational.factory_method.WaterWorld;
import creational.prototype.PineTree;
import creational.singleton.OrderManagementService;

void main() {
    System.out.println("---Singleton starts---");
    var orderManagService1 = OrderManagementService.getInstance();
    var orderManagService2 = OrderManagementService.getInstance();

    // var orderManagService3 = new OrderManagementService();

    System.out.println(orderManagService1 == orderManagService2);
    orderManagService1.placeOrder();
    System.out.println("---Singleton ends---");

    System.out.println();

    System.out.println("---Prototype starts---");
    PineTree originalPine = new PineTree();
    originalPine.x = 10;
    originalPine.y = 20;
    originalPine.color = "Dark Green";
    originalPine.needLength = 5;

    PineTree clonedPine = (PineTree) originalPine.clone();

    System.out.println("Original: " + originalPine);
    System.out.println("Cloned: " + clonedPine);

    System.out.println(originalPine == clonedPine);

    System.out.println("---Prototype ends---");

    System.out.println();

    System.out.println("---Factory starts---");
    EnemyFactory factory = new EnemyFactory();
    int playerLevel = 8;

    Enemy currentEnemy = factory.spawnEnemy(playerLevel);

    currentEnemy.showStatus();
    currentEnemy.attack();

    System.out.println("---Factory ends---");

    System.out.println();

    System.out.println("---Factory method starts---");

    GameWorld currentLevel;

    currentLevel = new WaterWorld();
    currentLevel.startJourney();

    currentLevel = new DesertWorld();
    currentLevel.startJourney();

    System.out.println("---Factory method ends---");

    System.out.println();

    System.out.println("---Abstract factory starts---");

    LevelFactory fireWorld = new FireLevelFactory();
    GameArea zone1 = new GameArea(fireWorld);
    zone1.play();

    LevelFactory iceWorld = new IceLevelFactory();
    GameArea zone2 = new GameArea(iceWorld);
    zone2.play();

    System.out.println("---Abstract factory ends---");

    System.out.println();

    System.out.println("---Builder starts---");

    Level tutorial = new LevelBuilder("Tutorial")
            .withSize(50, 50)
            .withEnemies(5)
            .build();

    Level bossArena = new LevelBuilder("Dragon's Lair")
            .withSize(500, 500)
            .withEnemies(50)
            .withWeather("Thunderstorm")
            .withBoss()
            .build();

    System.out.println(tutorial);
    System.out.println(bossArena);

    System.out.println("---Builder ends---");
}
