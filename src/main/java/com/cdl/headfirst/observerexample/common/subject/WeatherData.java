package com.cdl.headfirst.observerexample.common.subject;

import com.cdl.headfirst.observerexample.common.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList;//观察者集合
    private String temperature;//温度
    private String humidity;//湿度
    private String pressure;//压力

    public WeatherData() {
        observerList = new ArrayList<Observer>();
    }

    /**
     * 注册观察者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    /**
     * 删除观察者
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    /**
     * 气象站检测到变化通知观察者
     */
    public void measurementsChange() {
        notifyObservers();
    }

    /**
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }

}
