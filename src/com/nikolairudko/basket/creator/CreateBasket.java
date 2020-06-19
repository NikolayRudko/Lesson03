package com.nikolairudko.basket.creator;

import com.nikolairudko.basket.entity.*;
import com.nikolairudko.basket.exception.BasketException;

import java.util.List;

public class CreateBasket {
    public Basket fillUpHuge(Basket basket) {

        List<Ball> ballList = List.of(
                new Ball(BallSize.HUGE, BallColor.RED, BallMaterial.ALUMINIUM),
                new Ball(BallSize.HUGE, BallColor.ORANGE, BallMaterial.GLASS),
                new Ball(BallSize.HUGE, BallColor.YELLOW, BallMaterial.PLASTIC),
                new Ball(BallSize.HUGE, BallColor.GREEN, BallMaterial.STEEL),
                new Ball(BallSize.HUGE, BallColor.BLUE, BallMaterial.WOOD),
                new Ball(BallSize.HUGE, BallColor.INDIGO, BallMaterial.ALUMINIUM),
                new Ball(BallSize.HUGE, BallColor.VIOLET, BallMaterial.WOOD));

        for (Ball ball : ballList) {
            basket.add(ball);
        }
        return basket;
    }

    public Basket fillUpBig(Basket basket) {

        List<Ball> ballList = List.of(
                new Ball(BallSize.BIG, BallColor.RED, BallMaterial.ALUMINIUM),
                new Ball(BallSize.BIG, BallColor.ORANGE, BallMaterial.GLASS),
                new Ball(BallSize.BIG, BallColor.YELLOW, BallMaterial.PLASTIC),
                new Ball(BallSize.BIG, BallColor.GREEN, BallMaterial.STEEL),
                new Ball(BallSize.BIG, BallColor.BLUE, BallMaterial.WOOD),
                new Ball(BallSize.BIG, BallColor.INDIGO, BallMaterial.ALUMINIUM),
                new Ball(BallSize.BIG, BallColor.VIOLET, BallMaterial.WOOD));

        for (Ball ball : ballList) {
            basket.add(ball);
        }
        return basket;
    }

    public Basket fillUpMedium(Basket basket) {

        List<Ball> ballList = List.of(
                new Ball(BallSize.MEDIUM, BallColor.RED, BallMaterial.ALUMINIUM),
                new Ball(BallSize.MEDIUM, BallColor.ORANGE, BallMaterial.GLASS),
                new Ball(BallSize.MEDIUM, BallColor.YELLOW, BallMaterial.PLASTIC),
                new Ball(BallSize.MEDIUM, BallColor.GREEN, BallMaterial.STEEL),
                new Ball(BallSize.MEDIUM, BallColor.BLUE, BallMaterial.WOOD),
                new Ball(BallSize.MEDIUM, BallColor.INDIGO, BallMaterial.ALUMINIUM),
                new Ball(BallSize.MEDIUM, BallColor.VIOLET, BallMaterial.WOOD));

        for (Ball ball : ballList) {
            basket.add(ball);
        }
        return basket;
    }

    public Basket fillUpSmall(Basket basket) {

        List<Ball> ballList = List.of(
                new Ball(BallSize.SMALL, BallColor.RED, BallMaterial.ALUMINIUM),
                new Ball(BallSize.SMALL, BallColor.ORANGE, BallMaterial.GLASS),
                new Ball(BallSize.SMALL, BallColor.YELLOW, BallMaterial.PLASTIC),
                new Ball(BallSize.SMALL, BallColor.GREEN, BallMaterial.STEEL),
                new Ball(BallSize.SMALL, BallColor.BLUE, BallMaterial.WOOD),
                new Ball(BallSize.SMALL, BallColor.INDIGO, BallMaterial.ALUMINIUM),
                new Ball(BallSize.SMALL, BallColor.VIOLET, BallMaterial.WOOD));

        for (Ball ball : ballList) {
            basket.add(ball);
        }
        return basket;
    }
}
