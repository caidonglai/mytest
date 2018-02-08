package com.cdl.headfirst.observerexample.java.subject;


import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private List<Observer> observerList;//观察者集合
    private String temperature;//温度
    private String humidity;//湿度
    private String pressure;//压力

    /**
     * 通知观察者
     */
    public void measurementsChange() {
        // 使用java自带的观察者模式，通知观察这之前，必须调用setChanged()方法，不然无法通知
        setChanged();
        // notifyObservers(new Object());// 通知观察者，并将具体内容推送给观察者
        notifyObservers();// 通知观察者后，没有推送具体内容，需要观察者自己手动拉取数据
    }

    public void setMeasurements(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
    }
}
