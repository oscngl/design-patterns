package com.oscngl.design.patterns;

import com.oscngl.design.patterns.singleton.*;

public class DesignPatternsApplication {

    public static void main(String[] args) {

        EagerInitializationSingleton.getInstance().singletonTest();
        StaticBlockSingleton.getInstance().singletonTest();
        LazySingleton.getInstance().singletonTest();
        ThreadSafeSingleton.getInstance().singletonTest();
        BillPughSingleton.getInstance().singletonTest();

    }

}
