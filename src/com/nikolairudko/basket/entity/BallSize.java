package com.nikolairudko.basket.entity;

public enum BallSize {
    HUGE(0.2), BIG(0.1), MEDIUM(0.05), SMALL(0.01);
    private double radius;

    BallSize(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
