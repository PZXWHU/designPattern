package com.pzx.observer.builtin;

import java.util.Observable;

/**
 * 使用了Java内置的Observable实现主题
 * 1、但是Observable是一个类而不是一个接口，限制了其复用能力，必须新创建一个类继承它。
 * 2、而且Observable的setChanged方式是protected方法，所以我们没办法将Observable实例组合到自己的对象中去
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();//调用 notifyObservers()，必须先调用setChanged()，否则观察者不会被通知。此函数可避免过于频繁的通知观察者。
        notifyObservers();//实际调用notifyObservers(null)，不推送数据给观察者，而是观察者被通知后，主动拉数据
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     *getter函数用于观察者主动拉数据
     */

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
