package com.nikolairudko.basket.creator;

import com.nikolairudko.basket.entity.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CreateBasketTest {

    private CreateBasket creator;
    private Basket basketHuge;
    private Basket basketBig;
    private Basket basketMedium;
    private Basket basketSmall;
    private Basket expectedBasketHuge;
    private Basket expectedBasketBig;
    private Basket expectedBasketMedium;
    private Basket expectedBasketSmall;

    @BeforeMethod
    public void setUp() {
        //for huge balls
        creator = new CreateBasket();
        basketHuge = new Basket(0.11);
        List<Ball> ballListHuge = List.of(
                new Ball(BallSize.HUGE, BallColor.RED, BallMaterial.ALUMINIUM),
                new Ball(BallSize.HUGE, BallColor.ORANGE, BallMaterial.GLASS),
                new Ball(BallSize.HUGE, BallColor.YELLOW, BallMaterial.PLASTIC));
        expectedBasketHuge = new Basket(0.11);
        expectedBasketHuge.add(ballListHuge);
        //for big balls
        basketBig = new Basket(0.013);
        List<Ball> ballListBig = List.of(
                new Ball(BallSize.BIG, BallColor.RED, BallMaterial.ALUMINIUM),
                new Ball(BallSize.BIG, BallColor.ORANGE, BallMaterial.GLASS),
                new Ball(BallSize.BIG, BallColor.YELLOW, BallMaterial.PLASTIC));
        expectedBasketBig = new Basket(0.013);
        expectedBasketBig.add(ballListBig);
        //for medium balls
        basketMedium = new Basket(0.0016);
        List<Ball> ballListMedium = List.of(
                new Ball(BallSize.MEDIUM, BallColor.RED, BallMaterial.ALUMINIUM),
                new Ball(BallSize.MEDIUM, BallColor.ORANGE, BallMaterial.GLASS),
                new Ball(BallSize.MEDIUM, BallColor.YELLOW, BallMaterial.PLASTIC));
        expectedBasketMedium = new Basket(0.0016);
        expectedBasketMedium.add(ballListMedium);
        //for small balls
        basketSmall = new Basket(0.00003);
        List<Ball> ballListSmall = List.of(
                new Ball(BallSize.SMALL, BallColor.RED, BallMaterial.ALUMINIUM),
                new Ball(BallSize.SMALL, BallColor.ORANGE, BallMaterial.GLASS),
                new Ball(BallSize.SMALL, BallColor.YELLOW, BallMaterial.PLASTIC),
                new Ball(BallSize.SMALL, BallColor.GREEN, BallMaterial.STEEL),
                new Ball(BallSize.SMALL, BallColor.BLUE, BallMaterial.WOOD),
                new Ball(BallSize.SMALL, BallColor.INDIGO, BallMaterial.ALUMINIUM),
                new Ball(BallSize.SMALL, BallColor.VIOLET, BallMaterial.WOOD));
        expectedBasketSmall = new Basket(0.00003);
        expectedBasketSmall.add(ballListSmall);
    }

    @Test
    public void testFillUpHuge() {
        Assert.assertEquals(expectedBasketHuge, creator.fillUpHuge(basketHuge));
    }

    @Test
    public void testFillUpBig() {
        Assert.assertEquals(expectedBasketBig, creator.fillUpBig(basketBig));
    }

    @Test
    public void testFillUpMedium() {
        Assert.assertEquals(expectedBasketMedium, creator.fillUpMedium(basketMedium));
    }

    @Test
    public void testFillUpSmall() {
        Assert.assertEquals(expectedBasketSmall, creator.fillUpSmall(basketSmall));
    }
}