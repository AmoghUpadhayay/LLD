package WithoutStrategy;


// Same code in 2 classes OffRoad and Sport thus not advised
public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Sports Drive");
    }
}
