package com.oscngl.design.patterns;

import com.oscngl.design.patterns.factory.FileExporterFactory;
import com.oscngl.design.patterns.singleton.*;

public class DesignPatternsApplication {

    public static void main(String[] args) {

        // SINGLETON DESIGN PATTERN
        EagerInitializationSingleton.getInstance().singletonTest();
        StaticBlockSingleton.getInstance().singletonTest();
        LazySingleton.getInstance().singletonTest();
        ThreadSafeSingleton.getInstance().singletonTest();
        BillPughSingleton.getInstance().singletonTest();

        // FACTORY DESIGN PATTERN
        System.out.println(
                FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF).export("Test Content")
        );
        System.out.println(
                FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL).export("Test Content")
        );

    }

}
