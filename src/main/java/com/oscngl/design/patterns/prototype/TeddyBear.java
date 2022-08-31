package com.oscngl.design.patterns.prototype;

public class TeddyBear extends Bear {

    private int price;

    public TeddyBear(double mass, double height, int price) {
        super(mass, height);
        this.price = price;
    }

    public TeddyBear(TeddyBear teddyBear) {
        super(teddyBear);
        this.price = teddyBear.price;
    }

    @Override
    public Bear copy() {
        return new TeddyBear(this);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
