package com.nikolairudko.entity;

public enum BallColor {
    RED("Red"), ORANGE("Orange"), YELLOW("Yellow"), GREEN("Green"), BLUE("Blue"), INDIGO("Indigo"), VIOLET("Violet");
    private String color;

    BallColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
