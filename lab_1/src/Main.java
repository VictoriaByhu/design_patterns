import creational.prototype.PineTree;
import creational.singleton.OrderManagementService;

void main() {
    //Singleton pattern starts
    var orderManagService1 = OrderManagementService.getInstance();
    var orderManagService2 = OrderManagementService.getInstance();

    // var orderManagService3 = new OrderManagementService();

    System.out.println(orderManagService1 == orderManagService2);
    orderManagService1.placeOrder();
    //Singleton pattern ends
    System.out.println();

    //Prototype pattern starts
    PineTree originalPine = new PineTree();
    originalPine.x = 10;
    originalPine.y = 20;
    originalPine.color = "Dark Green";
    originalPine.needLength = 5;

    PineTree clonedPine = (PineTree) originalPine.clone();

    System.out.println("Original: " + originalPine);
    System.out.println("Cloned: " + clonedPine);

    System.out.println(originalPine == clonedPine);
    //Prototype pattern ends
}
