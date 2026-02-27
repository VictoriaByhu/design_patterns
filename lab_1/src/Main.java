import creational.singleton.OrderManagementService;

void main() {
    var orderManagService1 = OrderManagementService.getInstance();
    var orderManagService2 = OrderManagementService.getInstance();

    // var orderManagService3 = new OrderManagementService();

    System.out.println(orderManagService1 == orderManagService2);
    orderManagService1.placeOrder();
}
