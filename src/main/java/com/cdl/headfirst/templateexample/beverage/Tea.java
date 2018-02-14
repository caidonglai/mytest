package com.cdl.headfirst.templateexample.beverage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tea extends BeverageHook{

    @Override
    public void brew() {
        System.out.println("泡茶");
    }

    @Override
    public void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    public boolean customerWantCondiments() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("客户是否要加调料，（y/n）？");
        try {
            String judge = br.readLine();
            if (judge.startsWith("y")) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

}
