package com.nikolairudko.basket.service;

import com.nikolairudko.basket.entity.Ball;
import com.nikolairudko.basket.entity.BallColor;
import com.nikolairudko.basket.entity.Basket;

import java.util.List;

public class BasketService {

    public int countBall(Basket basket, BallColor color) {
        int count = 0;

        List<Ball> ballList = basket.getBallList();

        for (Ball ball : ballList) {
            if (color.equals(ball.getColor())) {
                count++;
            }
        }
        return count;
    }

    public double weightBall(Basket basket) {
        double weight = 0;

        List<Ball> ballList = basket.getBallList();

        for (Ball ball : ballList) {
            weight += ball.getMass();
        }
        return weight;
    }
}
