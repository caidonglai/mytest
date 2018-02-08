package com.cdl.headfirst.observerexample.common.observerimpl;

import com.cdl.headfirst.observerexample.common.observer.DisplayElement;
import com.cdl.headfirst.observerexample.common.observer.Observer;
import com.cdl.headfirst.observerexample.common.subject.Subject;

public class CurrnetConditionsDisplay implements Observer, DisplayElement {

    private String temperature;
    private String humidity;
    private String pressure;

    public CurrnetConditionsDisplay(Subject s) {
        s.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前环境检测，温度："+temperature+"， 湿度："+humidity+"， 压力："+pressure);
    }

    @Override
    public void update(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

}
