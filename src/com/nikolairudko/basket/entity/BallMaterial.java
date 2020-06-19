package com.nikolairudko.basket.entity;

public enum BallMaterial {

    ALUMINIUM("Aluminum", 2700),
    GLASS("Glass", 2500),
    PLASTIC("Plastic", 1020),
    STEEL("Steel", 7800),
    WOOD("Wood", 500);

    private double density;
    private String material;

    BallMaterial(String material, double density) {
        this.material = material;
        this.density = density;
    }

    public double getDensity() {
        return density;
    }

    public String getMaterial() {
        return material;
    }
}
