package ru.temperature;

public class CelsiusTemperature extends Temperature {
    public CelsiusTemperature(double temp) {
        super(temp);
    }
    @Override
    public String toString() {
        return super.toString() + " celsius";
    }
}
