package jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName CurrentConditionsDisplay
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/22 00:36
 * @Versrion 1.0
 **/
public class CurrentConditionsDisplay implements Observer {

    private double temperature;

    private double humidity;

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void subscribe(Observable observable){
        observable.addObserver(this);
    }

    public void display(){
        System.out.println("Current conditions: "+temperature+
                "F degress and "+humidity + "% humidity");
    }
}
