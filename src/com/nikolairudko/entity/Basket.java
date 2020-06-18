package com.nikolairudko.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private double volume;
    private double freeVolume;
    List<Ball> ballList;

    public Basket() {
    }

    public Basket(double volume) {
        this.volume = volume;
        freeVolume = volume;
        ballList = new ArrayList<>();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public List<Ball> getBallList() {
        return ballList;
    }

    public boolean add(Ball ball) {
        if (ball.getVolume() < freeVolume) {
            ballList.add(ball);
            freeVolume = freeVolume - ball.getVolume();
            return true;
        }
        return false;
    }

    public double getFreeVolume() {
        return freeVolume;
    }

    public void setFreeVolume(double freeVolume) {
        this.freeVolume = freeVolume;
    }

    private StringBuffer ballsInfo() {
        StringBuffer balls = new StringBuffer();
        for (Ball ball : ballList) {
            balls.append(ball.toString()).append("\n");
        }
        return balls;
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

        Basket basket = (Basket) obj;
        if (((Basket) obj).getVolume() != volume) {
            return false;
        }
        return ballList != null ? ballList.equals(basket.ballList) : basket.ballList == null;
    }

    @Override
    public int hashCode() {
        return 31 * (int) volume + (ballList != null ? ballList.hashCode() : 0);
    }

    @Override
    public String toString() {
        return String.format("Basket: volume - %.3f%nBalls:{%n%s}",
                volume, ballsInfo().toString());
    }
}
