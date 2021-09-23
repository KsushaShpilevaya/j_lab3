import ru.converter.CelsiusToCelsiusConverter;
import ru.converter.CelsiusToFahrenheitConverter;
import ru.converter.Converter;
import ru.temperature.CelsiusTemperature;
import ru.temperature.Temperature;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ConverterFactory {
    private static final Set<String> fahrenheitCountries = new HashSet<>(Arrays.asList("BS", "US", "BZ", "KY", "PW"));
    public static Converter getConverter(Locale locale) {
        if (fahrenheitCountries.contains(locale.getCountry())) {
            return new CelsiusToFahrenheitConverter();
        } else {
            return new CelsiusToCelsiusConverter();
            }
        }
}
