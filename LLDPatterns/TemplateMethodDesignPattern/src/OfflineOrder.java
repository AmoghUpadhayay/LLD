public class OfflineOrder extends  OrderProcessTemplate{
    @Override
    public void doSelect() {
        System.out.println("Customer searches and selects from rack");
    }

    @Override
    public void doPayment() {
        System.out.println("Customer gives money to accountant");
    }

    @Override
    public void doDelivery() {
        System.out.println("Order given to customer in hand");
    }
}
