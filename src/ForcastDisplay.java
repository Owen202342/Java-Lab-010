import java.io.IOException;

public class ForcastDisplay implements Display{

    WeatherStation ws;
    float currentPressure;
    float lastPressure;

    public ForcastDisplay(WeatherStation ws) throws IOException {
        this.ws = ws;
        ws.measure();
        lastPressure = 0;
        currentPressure = ws.getPressure();
    }
    public void update() throws IOException {
        ws.measure();
        lastPressure = currentPressure;
        currentPressure = ws.getPressure();
        display();
    }


    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
