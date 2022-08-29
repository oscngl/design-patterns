package com.oscngl.design.patterns.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton INSTANCE;

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private StaticBlockSingleton() {

    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

    public void singletonTest() {
        System.out.println("Static Block Singleton");
    }

}
