package ru.temperature;

public class KelvinTemperature extends Temperature {
    public KelvinTemperature(double temp) {
        super(temp);
    }
    @Override
    public String toString() {
        return super.toString() + " kelvin";
    }
}
