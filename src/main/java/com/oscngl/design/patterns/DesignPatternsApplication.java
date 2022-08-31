package com.oscngl.design.patterns;

import com.oscngl.design.patterns.adapter.Bugatti;
import com.oscngl.design.patterns.adapter.Mercedes;
import com.oscngl.design.patterns.adapter.MovableAdapter;
import com.oscngl.design.patterns.adapter.MovableAdapterImpl;
import com.oscngl.design.patterns.builder.Product;
import com.oscngl.design.patterns.composite.Department;
import com.oscngl.design.patterns.composite.FinancialDepartment;
import com.oscngl.design.patterns.composite.HeadDepartment;
import com.oscngl.design.patterns.composite.SalesDepartment;
import com.oscngl.design.patterns.decorator.*;
import com.oscngl.design.patterns.facade.EncryptionFacade;
import com.oscngl.design.patterns.factory.FileExporterFactory;
import com.oscngl.design.patterns.prototype.Bear;
import com.oscngl.design.patterns.prototype.GrizzlyBear;
import com.oscngl.design.patterns.prototype.TeddyBear;
import com.oscngl.design.patterns.singleton.*;

import java.util.ArrayList;
import java.util.List;

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

        // FACADE DESIGN PATTERN
        String text = "text";
        EncryptionFacade encryptionFacade = new EncryptionFacade();
        encryptionFacade.encrypt(text, EncryptionFacade.EncType.AES);
        encryptionFacade.encrypt(text, EncryptionFacade.EncType.MD5);
        encryptionFacade.encrypt(text, EncryptionFacade.EncType.SHA);

        // ADAPTER DESIGN PATTERN
        Mercedes mercedes = new Mercedes();
        MovableAdapter mercedesAdapter = new MovableAdapterImpl(mercedes);
        System.out.println("Mercedes' speed is " + mercedesAdapter.getSpeed() + " Kilometer per hour");

        Bugatti bugatti = new Bugatti();
        MovableAdapter bugattiAdapter = new MovableAdapterImpl(bugatti);
        System.out.println("Bugatti's speed is " + bugattiAdapter.getSpeed() + " Kilometer per hour");

        // COMPOSITE DESIGN PATTERN
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");
        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();

        // PROTOTYPE DESIGN PATTERN
        List<Bear> bears = List.of(
                new GrizzlyBear(20000, 1500, "Black"),
                new TeddyBear(50, 100, 20)
        );

        List<Bear> copyList = new ArrayList<>();
        for (Bear bear: bears) {
            copyList.add(bear.copy());
        }

        copyList.forEach(System.out::println);

    }

}
