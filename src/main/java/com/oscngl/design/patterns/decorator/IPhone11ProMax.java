package com.oscngl.design.patterns.decorator;

public class IPhone11ProMax extends IPhone11Pro {

    public IPhone11ProMax(IPhone basePhone) {
        super(basePhone);
    }

    @Override
    public String getName() {
        return super.getName() + " Max";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 200.0;
    }

}
