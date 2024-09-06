package com.jeido.exercice5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ShopTest {
    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void testShopWhenUpdate_SellIn_0_ThenResult_QualityDegrades_2_TimesMore() {
        shop.addProduct(new Product("Fruit", "Pomme", 0, 5));
        int awaitedQuality = 3;

        shop.update(shop.getProducts().getFirst());
        int result = shop.getProducts().getFirst().getQuality();

        Assertions.assertEquals(awaitedQuality, result);
    }

    @Test
    public void testShopQualityNeverNegative() {
        shop.addProduct(new Product("Fruit", "Pomme", -1, 5));

        int result = shop.getProducts().getFirst().getQuality();

        Assertions.assertTrue(result < 0);
    }

    @Test
    public void testShopWhenUpdate_SellIn_3_Quality_0_Then_Result_QualityNotNegative() {
        shop.addProduct(new Product("Fruit", "Pomme", 3, 0));

        shop.update(shop.getProducts().getFirst());
        int result = shop.getProducts().getFirst().getQuality();

        Assertions.assertTrue(result >= 0);
    }

    @Test
    public void testShopWhenUpdate_SellIn_0_Quality_0_Then_Result_QualityNotNegative() {
        shop.addProduct(new Product("Fruit", "Pomme", 0, 0));

        shop.update(shop.getProducts().getFirst());
        int result = shop.getProducts().getFirst().getQuality();

        Assertions.assertTrue(result >= 0);
    }

    @Test
    public void testShopQualityNeverHigherThan_50() {
        shop.addProduct(new Product("Fruit", "Pomme", 1, 55));

        Assertions.assertTrue(shop.getProducts().getFirst().getQuality() > 50);
    }

    @Test
    public void testShopWhenUpdate_Brie_SellIn_3_Quality_50() {
        shop.addProduct(new Product("Laitier", "Brie", 3, 50));
        int awaitedQuality = 50;

        shop.update(shop.getProducts().getFirst());
        int result = shop.getProducts().getFirst().getQuality();

        Assertions.assertEquals(awaitedQuality, result);
    }

    @Test
    public void testShopWhenUpdate_Brie_SellIn_0_Quality_50() {
        shop.addProduct(new Product("Laitier", "Brie", 0, 50));
        int awaitedMaximum = 50;

        shop.update(shop.getProducts().getFirst());
        int result = shop.getProducts().getFirst().getQuality();

        Assertions.assertTrue(result >= awaitedMaximum);
    }

    @Test
    public void testShopWhenUpdate_Brie_ThenResult_QualityRaise() {
        shop.addProduct(new Product("Laitier", "Brie", 4, 5));
        int awaitedQuality = 6;

        shop.update(shop.getProducts().getFirst());
        int result = shop.getProducts().getFirst().getQuality();

        Assertions.assertEquals(awaitedQuality, result);
    }

    @Test
    public void testShopWhenUpdate_Laitier_Sellin_3_Quality_5_ThenResult_Quality_3() {
        shop.addProduct(new Product("Laitier", "Yahourt", 3,5));
        int awaitedQuality = 3;

        shop.update(shop.getProducts().getFirst());
        int result = shop.getProducts().getFirst().getQuality();

        Assertions.assertEquals(awaitedQuality, result);
    }
}
