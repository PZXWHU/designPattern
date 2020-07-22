package com.pzx.observer.custom;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Subject weatherData;//此引用用于取消注册
    private float temperature;
    private float humidity;


    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition : " + temperature + "F degree and" + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
