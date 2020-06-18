package com.nikolairudko.creator;

import com.nikolairudko.entity.*;
import com.nikolairudko.exception.BasketException;

import java.util.List;

public class CreateBasket {

    public Basket fillUp(Basket basket) throws BasketException {

        List<Ball> ballList = List.of(
                new Ball(BallSize.HUGE, BallColor.GREEN, BallMaterial.ALUMINIUM),
                new Ball(BallSize.BIG, BallColor.BLUE, BallMaterial.STEEL),
                new Ball(BallSize.MEDIUM, BallColor.INDIGO, BallMaterial.WOOD),
                new Ball(BallSize.SMALL, BallColor.BLUE, BallMaterial.GLASS),
                new Ball(BallSize.BIG, BallColor.RED, BallMaterial.STEEL),
                new Ball(BallSize.HUGE, BallColor.YELLOW, BallMaterial.STEEL),
                new Ball(BallSize.BIG, BallColor.BLUE, BallMaterial.ALUMINIUM),
                new Ball(BallSize.HUGE, BallColor.RED, BallMaterial.WOOD),
                new Ball(BallSize.BIG, BallColor.ORANGE, BallMaterial.STEEL));

        for (Ball ball: ballList){
            /*if(!basket.add(ball)){
                throw new BasketException("Basket is full");
            }*/
            basket.add(ball);
        }
        return basket;
    }
}
