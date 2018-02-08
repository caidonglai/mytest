package com.cdl.headfirst.observerexample.java;

import com.cdl.headfirst.observerexample.java.observer.CurrentConditionsDisplay;
import com.cdl.headfirst.observerexample.java.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        // 为气象站添加观察者
        CurrentConditionsDisplay c = new CurrentConditionsDisplay(wd);
        // 气象站更新当前数据
        wd.setMeasurements("38C", "80%", "10%");
    }

}
