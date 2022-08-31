package com.oscngl.design.patterns.adapter;

public class MovableAdapterImpl implements MovableAdapter{

    private Movable cars;

    public MovableAdapterImpl(Movable cars) {
        this.cars = cars;
    }

    @Override
    public double getSpeed() {
        double speed = cars.getSpeed();
        return convertMileToKilometer(speed);
    }

    private double convertMileToKilometer(double milePerHour) {
        return milePerHour * 1.609344;
    }

}
