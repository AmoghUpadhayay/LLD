package WithStrategy;

public class SportVehicle extends Vehicle{
    public SportVehicle(DriveStrategy driveStrategy) {
        super(new SportDrive());
    }
}
