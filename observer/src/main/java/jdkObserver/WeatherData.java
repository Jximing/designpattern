package jdkObserver;

import java.util.Observable;

/**
 * @ClassName WeatherData
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/22 00:30
 * @Versrion 1.0
 **/
public class WeatherData extends Observable {

    private double temperature;
    private double humidity;
    private double pressure;

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(double temperature,double humidity,double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
