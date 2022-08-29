package com.oscngl.design.patterns.decorator;

public class IPhone11Pro extends IPhone11{

    public IPhone11Pro(IPhone basePhone) {
        super(basePhone);
    }

    @Override
    public String getName() {
        return super.getName() + " Pro";
    }

    @Override
    public int getCameraCount() {
        return super.getCameraCount() + 1;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100.0;
    }

}
