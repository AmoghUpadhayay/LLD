package AbstractOrDoubleLayer;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class LuxuryFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String vehicleName) {
        switch(vehicleName){
            case "Mercedes":
                return new Mercedes();
            case "BMW":
                return new Bmw();
            default:
                return null;
        }
    }
}
