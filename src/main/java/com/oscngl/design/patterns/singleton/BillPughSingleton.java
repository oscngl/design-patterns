package com.oscngl.design.patterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.getInstance();
    }

    private static class SingletonHelper {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();

        public static BillPughSingleton getInstance() {
            return INSTANCE;
        }

    }

    public void singletonTest() {
        System.out.println("Bill Pugh Singleton");
    }

}
