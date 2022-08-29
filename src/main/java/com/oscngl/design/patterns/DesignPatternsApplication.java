package com.oscngl.design.patterns;

import com.oscngl.design.patterns.builder.Product;
import com.oscngl.design.patterns.decorator.*;
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

        // BUILD DESIGN PATTERN
        System.out.println(
                new Product.ProductBuilder()
                        .id(1L)
                        .name("name")
                        .build()
        );

        // DECORATOR DESIGN PATTERN
        Phone phone1 = new IPhone11(new IPhone());
        System.out.println("Name:" + phone1.getName());
        System.out.println("Camera:" + phone1.getCameraCount());
        System.out.println("Price:" + phone1.getPrice());

        Phone phone2 = new IPhone11Pro(new IPhone());
        System.out.println("Name:" + phone2.getName());
        System.out.println("Camera:" + phone2.getCameraCount());
        System.out.println("Price:" + phone2.getPrice());

        Phone phone3 = new IPhone11ProMax(new IPhone());
        System.out.println("Name:" + phone3.getName());
        System.out.println("Camera:" + phone3.getCameraCount());
        System.out.println("Price:" + phone3.getPrice());

    }

}
