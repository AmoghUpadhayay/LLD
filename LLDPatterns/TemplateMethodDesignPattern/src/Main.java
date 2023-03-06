public class Main {
    public static void main(String[] args) {
        OrderProcessTemplate order1 = new OfflineOrder();
        order1.processOrder(true);

        OrderProcessTemplate order2 = new OnlineOrder();
        order2.processOrder(true);
    }
}