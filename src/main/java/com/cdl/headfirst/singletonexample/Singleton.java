package com.cdl.headfirst.singletonexample;

/**
 * 单件模式
 */
public class Singleton {

    // 急切实例化，也能够避免多线程问题
    //private static Singleton singleton = new Singleton();

    //变量加锁，防止多线程并发
    //private volatile static Singleton singleton;

    private static Singleton singleton;

    // 单件模式一定要把构造方法设置成私有的，防止在别的地方实例化
    private Singleton() {}

    // 这个写法不能防止多线程并发
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    // 同步方法，防止多线程并发，但是会降低效率100倍左右
    public static synchronized Singleton getInstance2() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    // 双重检查加锁，可有防止多线程并发，同时也避免了实例化后每次调用同步方法降低效率
    public static Singleton getInstance3() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
