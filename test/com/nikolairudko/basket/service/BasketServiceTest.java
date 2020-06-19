package com.nikolairudko.basket.service;

import com.nikolairudko.basket.entity.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasketServiceTest {

    private Basket basket;
    private BasketService service;

    @BeforeMethod
    public void setUp() {
        basket = new Basket(0.1);
        service = new BasketService();
        basket.add(new Ball(BallSize.SMALL, BallColor.BLUE, BallMaterial.ALUMINIUM));
        basket.add(new Ball(BallSize.SMALL, BallColor.BLUE, BallMaterial.ALUMINIUM));
        basket.add(new Ball(BallSize.SMALL, BallColor.RED, BallMaterial.ALUMINIUM));
    }

    @Test
    public void testCountBall() {
        Assert.assertEquals(2, service.countBall(basket, BallColor.BLUE));
    }

    @Test
    public void testFailCountBall() {
        Assert.assertNotEquals(3, service.countBall(basket, BallColor.BLUE));
    }

    @Test
    public void testWeightBall() {
        Assert.assertEquals(0.0339, service.weightBall(basket), 0.0001);
    }

    @Test
    public void testFailWeightBall() {
        Assert.assertNotEquals(0.0338, service.weightBall(basket), 0.0001);
    }
}