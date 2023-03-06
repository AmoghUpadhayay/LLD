package S;

// One class should have just one reason to change, this has two
// Solution : Make two classes with one function each
public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(int quantity){
        this.marker = new Marker("Black", 20);
        this.quantity = quantity;
    }
    // Responsibility 1 : Suppose in future we want to add GST, we have to make change
    public int calculatePrice(){
        return quantity*(marker.cost);
    }
    // Responsibility 2 : Suppose in future we want to save to file, we have to make change
    public void saveToDb(){
        ///Save To Db
    }
}
