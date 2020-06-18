package com.nikolairudko.entity;

public enum BallMaterial {

    WOOD("Wood", 500),
    STEEL("Steel", 7800),
    ALUMINIUM("Aluminum", 2700),
    PLASTIC("Plastic", 1020),
    GLASS("Glass", 2500);

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
