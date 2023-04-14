import java.io.IOException;

public class currentConditions implements Display {

    private WeatherStation ws;
    private float temperature;
    private float humidity;

    private float pressure;

    public currentConditions(WeatherStation ws) throws IOException {
        this.ws = ws;
        ws.measure();

        temperature = ws.getTemperature();
        humidity = ws.getHumidity();
        pressure = ws.getPressure();
    }
    public void display() {
        System.out.println("");
        System.out.println("The pressure is: "+pressure);
        System.out.println("The temperature is: "+temperature);
        System.out.println("The humidity is: "+ humidity);
        System.out.println("");

    }


    public void update() throws IOException {
        ws.measure();
        temperature = ws.getTemperature();
        humidity = ws.getHumidity();
        pressure = ws.getPressure();
        display();


    }
}
