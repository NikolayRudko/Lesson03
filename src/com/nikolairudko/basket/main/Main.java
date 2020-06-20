package com.nikolairudko.basket.main;

import com.nikolairudko.basket.creator.CreateBasket;
import com.nikolairudko.basket.entity.*;
import com.nikolairudko.basket.exception.BasketException;
import com.nikolairudko.basket.service.BasketService;

public class Main {
    public static void main(String[] args) throws BasketException {
        Basket basket = new Basket(0.01);
        System.out.println(basket);
        BasketService service = new BasketService();
        CreateBasket create = new CreateBasket();
        create.fillUpHuge(basket);
        System.out.println(basket);

        Basket basket1 = new Basket(0.1);

        basket1.add(new Ball(BallSize.SMALL, BallColor.RED, BallMaterial.ALUMINIUM));
        basket1.add(new Ball(BallSize.SMALL, BallColor.RED, BallMaterial.ALUMINIUM));
        basket1.add(new Ball(BallSize.SMALL, BallColor.RED, BallMaterial.ALUMINIUM));

        System.out.println(basket1);

        System.out.println(service.weightBall(basket1));
        //System.out.println(service.countBall(basket,BallColor.BLUE));
    }
}
