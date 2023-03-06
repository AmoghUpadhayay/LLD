package AbstractOrDoubleLayer;

public class Factory {
    public VehicleFactory getVehicleFactory(String vehicleFactoryName){
        switch (vehicleFactoryName){
            case "Luxurious":
                return new LuxuryFactory();
            case "Ordinary":
                return new OrdinaryFactory();
            default:
                return null;
        }
    }
}
