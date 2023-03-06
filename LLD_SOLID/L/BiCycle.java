package L;

public class BiCycle implements Bike{
    @Override
    public void turnEngineOn() {
        // throws exception as bicycle doesn't have engine thus narrowing down the functionality of interface :
        // Not Advised
    }
}
