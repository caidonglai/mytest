package com.cdl.headfirst.templateexample.beverage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Coffee extends BeverageHook {

    @Override
    public void brew() {
        System.out.println("冲咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("加糖和牛奶");
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
