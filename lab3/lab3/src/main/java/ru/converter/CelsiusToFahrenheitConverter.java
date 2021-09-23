package ru.converter;

import ru.temperature.CelsiusTemperature;
import ru.temperature.FahrenheitTemperature;
import ru.temperature.Temperature;

public class CelsiusToFahrenheitConverter implements Converter {
    @Override
    public Temperature convert(Temperature temp) throws ClassCastException {
        if (temp instanceof CelsiusTemperature) {
            return new FahrenheitTemperature(temp.getTemp() * 1.8 + 32.0);
        }
        throw new ClassCastException("Можно преобразовать только цельсии.");
    }
}
