package ru.converter;

import ru.temperature.CelsiusTemperature;
import ru.temperature.FahrenheitTemperature;
import ru.temperature.KelvinTemperature;
import ru.temperature.Temperature;

public class CelsiusToKelvinConverter implements Converter {
    @Override
    public Temperature convert(Temperature temp) throws ClassCastException {
        if (temp instanceof CelsiusTemperature) {
            return new KelvinTemperature(temp.getTemp() + 273.15);
        }
        throw new ClassCastException("Можно преобразовать только цельсии.");
    }
}
