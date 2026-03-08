import creational.factory.Enemy;
import creational.factory.EnemyFactory;
import creational.prototype.PineTree;
import creational.singleton.OrderManagementService;

void main() {
    System.out.println("Singleton starts");
    var orderManagService1 = OrderManagementService.getInstance();
    var orderManagService2 = OrderManagementService.getInstance();

    // var orderManagService3 = new OrderManagementService();

    System.out.println(orderManagService1 == orderManagService2);
    orderManagService1.placeOrder();
    System.out.println("Singleton ends");

    System.out.println();

    System.out.println("Prototype starts");
    PineTree originalPine = new PineTree();
    originalPine.x = 10;
    originalPine.y = 20;
    originalPine.color = "Dark Green";
    originalPine.needLength = 5;

    PineTree clonedPine = (PineTree) originalPine.clone();

    System.out.println("Original: " + originalPine);
    System.out.println("Cloned: " + clonedPine);

    System.out.println(originalPine == clonedPine);

    System.out.println("Prototype ends");

    System.out.println();

    System.out.println("Factory starts");
    EnemyFactory factory = new EnemyFactory();
    int playerLevel = 8;

    Enemy currentEnemy = factory.spawnEnemy(playerLevel);

    currentEnemy.showStatus();
    currentEnemy.attack();

    System.out.println("Factory ends");

    System.out.println();
}
