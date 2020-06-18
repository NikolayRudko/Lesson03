package com.nikolairudko.main;

import com.nikolairudko.creator.CreateBasket;
import com.nikolairudko.entity.*;
import com.nikolairudko.exception.BasketException;
import com.nikolairudko.service.BasketService;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws BasketException {
        Ball ball = new Ball(BallSize.HUGE, BallColor.GREEN, BallMaterial.ALUMINIUM);

        System.out.println(ball);

        Basket basket = new Basket(0.001);

        BasketService service = new BasketService();
        System.out.printf("%s%n Free volume - %s%n",basket,basket.getFreeVolume());
        System.out.println(basket);
        CreateBasket create = new CreateBasket();
        create.fillUp(basket);
        System.out.printf("%s%n Free volume - %s%n",basket,basket.getFreeVolume());

        System.out.println(service.weightOfBall(basket));
        System.out.println(service.countOfBall(basket,BallColor.BLUE));
    }
}
