package com.nikolairudko.basket.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final double volume;
    private List<Ball> ballList;

    public Basket(double volume) {
        ballList = new ArrayList<>();
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public List<Ball> getBallList() {
        return ballList;
    }

    public boolean add(Ball ball) {
        if (ball.getVolume() < freeVolume()) {
            ballList.add(ball);
            return true;
        }
        return false;
    }

    private double freeVolume() {
        double currentVolume = 0;
        for (Ball nestedBall : ballList) {
            currentVolume += nestedBall.getVolume();
        }
        return volume - currentVolume;
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
        return String.format("Basket: volume - %.5f%nFree volume - %.5f%nBalls:{%n%s}",
                volume, freeVolume(), ballsInfo().toString());
    }
}
