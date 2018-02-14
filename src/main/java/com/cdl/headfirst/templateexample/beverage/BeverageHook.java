package com.cdl.headfirst.templateexample.beverage;

/**
 * 饮料（包含钩子方法）
 */
public abstract class BeverageHook {

    // 模板模式方法（做饮料）
    protected final void doBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }

    // 煮开水
    public void boilWater() {
        System.out.println("煮开水");
    }

    // 泡、煮
    public abstract void brew();

    // 倒入杯子中
    public void pourInCup() {
        System.out.println("导入杯子中");
    }

    // 加调料
    public abstract void addCondiments();

    // 客户是否想要加调料（钩子方法)
    public boolean customerWantCondiments() {
        return true;
    }

}
