import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.converter.Converter;
import ru.temperature.CelsiusTemperature;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Converter converter = context.getBean("celsiusConverter", Converter.class);
        Scanner in = new Scanner(System.in);
        CelsiusTemperature temperature = new CelsiusTemperature(in.nextDouble());
        System.out.println(converter.convert(temperature));
        context.close();
    }
}
