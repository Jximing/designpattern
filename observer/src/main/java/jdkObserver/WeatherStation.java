package jdkObserver;

/**
 * @ClassName WeatherStation
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/22 00:45
 * @Versrion 1.0
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay();
        display.subscribe(weatherData);

        weatherData.setMeasurements(80,65,30.4);
        weatherData.setMeasurements(82,70,29.4);
        weatherData.setMeasurements(78,90,31.2);
    }
}
