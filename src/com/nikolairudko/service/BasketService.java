package com.nikolairudko.service;

import com.nikolairudko.entity.Ball;
import com.nikolairudko.entity.BallColor;
import com.nikolairudko.entity.Basket;

public class BasketService {

    public int countOfBall(Basket basket, BallColor color) {
        int count = 0;
        for (Ball ball : basket.getBallList()) {
            if (color.equals(ball.getColor())) {
                count++;
            }
        }
        return count;
    }

    public double weightOfBall(Basket basket) {
        double weight = 0;
      //  if (basket.getBallList())
        for (Ball ball : basket.getBallList()) {
            weight += ball.getMass();
        }
        return weight;
    }
}
