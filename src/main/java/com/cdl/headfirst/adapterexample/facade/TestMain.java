package com.cdl.headfirst.adapterexample.facade;

public class TestMain {

    public static void main(String[] args) {
        Screen s = new Screen();
        Light l = new Light();
        Projector p = new Projector();
        DvdPlayer d = new DvdPlayer();
        // 外观模式，简化接口
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(s, l, p, d);
        homeTheaterFacade.watchMovice();
    }

}
