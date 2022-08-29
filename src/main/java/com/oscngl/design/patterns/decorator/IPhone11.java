package com.oscngl.design.patterns.decorator;

public class IPhone11 extends PhoneDecorator{

    public IPhone11(IPhone basePhone) {
        super(basePhone);
    }

    @Override
    public String getName() {
        return super.getName() + " 11";
    }

}
