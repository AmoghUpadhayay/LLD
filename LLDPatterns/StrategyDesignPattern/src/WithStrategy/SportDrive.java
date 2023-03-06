package WithStrategy;

public class SportDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Sport Drive");
    }
}
