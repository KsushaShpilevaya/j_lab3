package ru.converter;

import ru.temperature.Temperature;
@FunctionalInterface
public interface Converter
{
    public Temperature convert(Temperature temp);
}
