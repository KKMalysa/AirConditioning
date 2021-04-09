package AirConditioner;

public class ProAirConditioner implements AirConditioner{
    private static final double COOL_TEMPERATURE = 2;

    @Override
    public double lowerTemperature(double temperature, double cubature) {
        return temperature-(COOL_TEMPERATURE/cubature);
    }

    @Override
    public String toString() {
        return "ProAirConditioner{}";
    }
}
