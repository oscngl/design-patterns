package com.oscngl.design.patterns.prototype;

public abstract class Bear {

    private double mass;
    private double height;

    public abstract Bear copy();

    public Bear(Bear bear) {
        this.mass = bear.mass;
        this.height = bear.height;
    }

    public Bear(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "mass=" + mass +
                ", height=" + height +
                '}';
    }

}
