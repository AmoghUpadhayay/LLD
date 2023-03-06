import AbstractOrDoubleLayer.Factory;
import AbstractOrDoubleLayer.Vehicle;
import AbstractOrDoubleLayer.VehicleFactory;
import singleLayer.Shape;
import singleLayer.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        /* ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Rectangle");
        shape.draw();*/

        Factory factory = new Factory();
        VehicleFactory vehicleFactory = factory.getVehicleFactory("Luxurious");
        Vehicle vehicle = vehicleFactory.getVehicle("BMW");

        vehicle.average();
    }
}