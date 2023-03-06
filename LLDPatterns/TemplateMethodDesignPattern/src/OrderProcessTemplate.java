public abstract class OrderProcessTemplate {
    public Boolean isGift;
    public abstract void doSelect();
    public abstract void doPayment();

    // Use of final keyword is sometimes not advised as we won't be able to change this in future
    // this is invariant method (Template method 1)
    public final void giftWrap(){
        System.out.println("Gift Wrap Successful");
    }

    public abstract void doDelivery();

    // this is Template Method 2
    public final void processOrder(Boolean isGift){
        this.doSelect();
        this.doPayment();
        if(isGift){
            this.giftWrap();
        }
        this.doDelivery();
    }
}

