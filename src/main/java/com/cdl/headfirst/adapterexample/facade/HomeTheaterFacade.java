package com.cdl.headfirst.adapterexample.facade;

/**
 * 家庭剧场，外观模式
 */
public class HomeTheaterFacade {

    private Screen screen;
    private Light light;
    private Projector projector;
    private DvdPlayer dvdPlayer;

    public HomeTheaterFacade(Screen s, Light l, Projector p, DvdPlayer d) {
        this.screen = s;
        this.light = l;
        this.projector = p;
        this.dvdPlayer = d;
    }

    public void watchMovice() {
        light.on();
        screen.down();
        projector.on();
        dvdPlayer.on();
        dvdPlayer.setDvd();
    }

}
