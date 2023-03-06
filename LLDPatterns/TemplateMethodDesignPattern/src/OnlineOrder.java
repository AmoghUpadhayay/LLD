public class OnlineOrder extends OrderProcessTemplate{

    @Override
    public void doSelect() {
        System.out.println("Customer searches and selects the order");
    }

    @Override
    public void doPayment() {
        System.out.println("Customer choose COD or PayTM");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item Delivered at doorstep");
    }
}
