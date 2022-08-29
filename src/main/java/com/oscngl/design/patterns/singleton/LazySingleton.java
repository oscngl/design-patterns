package com.oscngl.design.patterns.singleton;

public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    public void singletonTest() {
        System.out.println("Lazy Singleton");
    }

}
