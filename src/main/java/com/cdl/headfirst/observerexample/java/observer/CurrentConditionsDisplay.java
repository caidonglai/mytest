package com.cdl.headfirst.observerexample.java.observer;

import com.cdl.headfirst.observerexample.java.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private String temperature;
    private String humidity;
    private String pressure;

    public CurrentConditionsDisplay(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData wd = (WeatherData)o;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            this.pressure = wd.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("java自带观察者模式，当前环境检测，温度："+temperature+"， 湿度："+humidity+"， 压力："+pressure);
    }

}
