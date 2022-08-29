package com.oscngl.design.patterns.decorator;

public class IPhone implements Phone{

    @Override
    public String getName() {
        return "IPhone";
    }

    @Override
    public int getCameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 799.9;
    }

}
