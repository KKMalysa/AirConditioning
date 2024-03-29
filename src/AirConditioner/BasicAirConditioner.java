package AirConditioner;

public class BasicAirConditioner implements AirConditioner {
    private static final double COOL_TEMPERATURE = 1;

    @Override
    public double lowerTemperature(double temperature, double cubature) {
        return temperature-(COOL_TEMPERATURE/cubature);
    }

    @Override
    public String toString() {
        return "BasicAirConditioner{}";
    }
}
