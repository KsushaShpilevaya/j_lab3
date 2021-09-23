package ru.temperature;

public class Temperature {
    private double temp;
    Temperature(double temp) {
        this.temp = temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return String.valueOf(temp);
    }
}
