package WithStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(DriveStrategy driveStrategy){
        super(new NormalDrive());
    }
}
