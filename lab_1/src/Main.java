import behavioral.command.Command;
import behavioral.command.GameCharacter;
import behavioral.command.InputHandler;
import behavioral.command.MoveForwardCommand;
import behavioral.strategy.BowAttack;
import behavioral.strategy.Hero;
import behavioral.strategy.SpellAttack;
import behavioral.strategy.SwordAttack;
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
import structural.adapter.ExternalSteamService;
import structural.adapter.GameAchievements;
import structural.adapter.SteamAdapter;
import structural.bridge.*;
import structural.composite.GameUnit;
import structural.composite.Soldier;
import structural.composite.Squad;
import structural.decorator.FireEnchantment;
import structural.decorator.SharpnessEnchantment;
import structural.decorator.Sword;
import structural.decorator.Weapon;
import structural.facade.GameLauncher;
import structural.flyweight.Tree;
import structural.flyweight.TreeFactory;
import structural.flyweight.TreeType;
import structural.proxy.ProxyVideoGameMap;
import structural.proxy.VideoGameMap;

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

    System.out.println();

    System.out.println("---Proxy starts---");

    VideoGameMap map1 = new ProxyVideoGameMap("Dust_2.map");
    VideoGameMap map2 = new ProxyVideoGameMap("Inferno.map");
    VideoGameMap map3 = new ProxyVideoGameMap("Nuke.map");

    System.out.println("--- Game is running, you are in the main menu ---");
    System.out.println("Choose a map...");

    System.out.println("\n[Event: Player clicked on Dust_2]");
    map1.display();

    System.out.println("\n[Event: Returning to Dust_2 after a break]");
    map1.display();

    System.out.println("\n--- Game over ---");

    System.out.println("---Proxy ends---");

    System.out.println();

    System.out.println("---Decorator starts---");

    Weapon mySword = new Sword();
    System.out.println(mySword.getDescription() + " | Damage: " + mySword.getDamage());

    mySword = new FireEnchantment(mySword);
    System.out.println(mySword.getDescription() + " | Damage: " + mySword.getDamage());

    mySword = new SharpnessEnchantment(mySword);
    System.out.println(mySword.getDescription() + " | Damage: " + mySword.getDamage());

    System.out.println("---Decorator ends---");

    System.out.println();

    System.out.println("---Adapter starts---");

    ExternalSteamService steamApi = new ExternalSteamService();

    GameAchievements achievements = new SteamAdapter(steamApi);

    achievements.unlockAchievement("First Blood");

    System.out.println("---Adapter ends---");

    System.out.println();

    System.out.println("---Facade starts---");

    GameLauncher launcher = new GameLauncher();
    launcher.startLevel();

    System.out.println("---Facade ends---");

    System.out.println();

    System.out.println("---Bridge starts---");

    Device myTv = new TV();
    Remote basicRemote = new Remote(myTv);
    basicRemote.togglePower();

    Device myRadio = new Radio();
    AdvancedRemote smartRemote = new AdvancedRemote(myRadio);
    smartRemote.togglePower();
    smartRemote.mute();

    System.out.println("---Bridge ends---");
    System.out.println();

    System.out.println("---Flyweight starts---");

    int treesToPlant = 20;

    System.out.println("Start planting " + treesToPlant + " trees...");

    TreeType oakType = TreeFactory.getTreeType("Oak", "Dark Green", "HeavyOakTexture_V2.png");
    TreeType pineType = TreeFactory.getTreeType("Pine", "Emerald", "PineNeedlesTexture.png");

    for (int i = 0; i < treesToPlant / 2; i++) {
        new Tree((int)(Math.random() * 1000), (int)(Math.random() * 1000), oakType).display();

        new Tree((int)(Math.random() * 1000), (int)(Math.random() * 1000), pineType).display();
    }

    System.out.println("--- Planing completed! ---");

    System.out.println("---Flyweight ends---");
    System.out.println();

    System.out.println("---Composite starts---");

    GameUnit s1 = new Soldier("Wes");
    GameUnit s2 = new Soldier("Daniel");
    GameUnit s3 = new Soldier("Gabriel");

    Squad squad1 = new Squad();
    squad1.addUnit(s1);
    squad1.addUnit(s2);

    Squad army = new Squad();
    army.addUnit(squad1);
    army.addUnit(s3);

    System.out.println("Order to one soldier:");
    s1.move();

    System.out.println("\nOrder to the entire army:");
    army.move();

    System.out.println("---Composite ends---");

    System.out.println();

    System.out.println("---Strategy stats---");

    Hero hero = new Hero();

    hero.setStrategy(new SwordAttack());
    hero.executeAttack();

    hero.setStrategy(new BowAttack());
    hero.executeAttack();

    hero.setStrategy(new SpellAttack());
    hero.executeAttack();

    System.out.println("---Strategy ends---");

    System.out.println();

    System.out.println("---Command starts---");

    GameCharacter player = new GameCharacter();
    InputHandler controller = new InputHandler();


    Command walk = new MoveForwardCommand(player);
    controller.setCommand(walk);

    controller.pressButton();

    System.out.println("---Command ends---");

    System.out.println();

}
