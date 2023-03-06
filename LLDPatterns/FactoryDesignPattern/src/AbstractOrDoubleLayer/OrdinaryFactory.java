package AbstractOrDoubleLayer;

public class OrdinaryFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleName) {
        switch(vehicleName){
            case "Hyundai":
                return new Hyundai();
            case "Maruti":
                return new Maruti();
            default:
                return null;
        }
    }
}
