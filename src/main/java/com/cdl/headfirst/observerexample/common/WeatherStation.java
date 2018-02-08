package com.cdl.headfirst.observerexample.common;

import com.cdl.headfirst.observerexample.common.observerimpl.CurrnetConditionsDisplay;
import com.cdl.headfirst.observerexample.common.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData wd =  new WeatherData();
        // 为气象站添加观察者
        CurrnetConditionsDisplay c = new CurrnetConditionsDisplay(wd);
        // 气象站更新当前数据
        wd.setMeasurements("38C", "80%", "10%");
    }

}
