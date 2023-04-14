import java.io.IOException;

public class StatisticsDisplay implements Display {
    private WeatherStation ws;
    float temperatureMin = 0;
    float temperatureMax = 0;
    float temperatureTotal;

    int numReadings;



    public StatisticsDisplay(WeatherStation ws) throws IOException {
        this.ws = ws;


        ws.measure();
        temperatureMax= ws.getTemp_max();
        temperatureMin = ws.getTemp_min();
        temperatureTotal = (temperatureMax+temperatureMin)/2;
        numReadings++;
        display();


    }


    public void update() throws IOException {
        ws.measure();
        temperatureMax= ws.getTemp_max();
        temperatureMin = ws.getTemp_min();
        temperatureTotal = (temperatureMax+temperatureMin)/2;
        numReadings++;
        display();

    }
    public void display() {
        System.out.println("");
        System.out.println("The minimum temperature is: "+ temperatureMin);
        System.out.println("The maximum temperature is: "+ temperatureMax);
        System.out.println("The average temp is: "+temperatureTotal);
        System.out.println("The Station has been read: "+numReadings+" times");
        System.out.println("");
    }

}
