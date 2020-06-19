package com.nikolairudko.basket.entity;

public class Ball {

    private BallSize size;
    private BallColor color;
    private BallMaterial material;

    public Ball(){
    }

    public Ball(BallSize size, BallColor color, BallMaterial material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public BallSize getSize() {
        return size;
    }

    public void setSize(BallSize size) {
        this.size = size;
    }

    public BallColor getColor() {
        return color;
    }

    public void setColor(BallColor color) {
        this.color = color;
    }

    public BallMaterial getMaterial() {
        return material;
    }

    public void setMaterial(BallMaterial material) {
        this.material = material;
    }
    
    public double getVolume(){
        return (4f / 3) * Math.PI * Math.pow(size.getRadius(), 3);
    }

    public double getMass() {
        return  material.getDensity() * getVolume();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Ball ball = (Ball) obj;

        return size == ball.size &&
                color == ball.color &&
                material == ball.material;
    }

    @Override
    public int hashCode() {
        return (size != null ? size.hashCode() : 0) +
                (color != null ? color.hashCode() : 0) +
                (material != null ? material.hashCode() : 0);
    }

    @Override
    public String toString() {
        return String.format("Ball: radius - %.3f, color - %s, material - %s, volume - %f",
                size.getRadius(), color.getColor(), material.getMaterial(), getVolume());
    }
}
