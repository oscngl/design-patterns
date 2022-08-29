package com.oscngl.design.patterns.decorator;

public class PhoneDecorator implements Phone{

    protected Phone basePhone;

    public PhoneDecorator(IPhone basePhone) {
        this.basePhone = basePhone;
    }

    @Override
    public String getName() {
        return basePhone.getName();
    }

    @Override
    public int getCameraCount() {
        return basePhone.getCameraCount();
    }

    @Override
    public double getPrice() {
        return basePhone.getPrice();
    }

}
