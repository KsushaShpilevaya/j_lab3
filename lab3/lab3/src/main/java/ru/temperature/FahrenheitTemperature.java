package ru.temperature;

public class FahrenheitTemperature extends Temperature {
    public FahrenheitTemperature(double temp) {
        super(temp);
    }
    @Override
    public String toString() {
        return super.toString() + " fahrenheit";
    }
}
