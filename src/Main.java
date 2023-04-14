import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WeatherStation b = new WeatherStation();
        ForcastDisplay f = new ForcastDisplay(b);
        StatisticsDisplay s = new StatisticsDisplay(b);
        currentConditions c = new currentConditions(b);


    }
}
