package com.oscngl.design.patterns.prototype;

public class GrizzlyBear extends Bear {

    private String color;

    public GrizzlyBear(double mass, double height, String color) {
        super(mass, height);
        this.color = color;
    }

    private GrizzlyBear(GrizzlyBear grizzlyBear) {
        super(grizzlyBear);
        this.color = grizzlyBear.color;
    }

    @Override
    public Bear copy() {
        return new GrizzlyBear(this);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
