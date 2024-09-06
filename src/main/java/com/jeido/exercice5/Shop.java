package com.jeido.exercice5;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        products = new ArrayList<Product>();
    }

    public void update(Product product) {
        products.remove(product);
        product.setSellIn(product.getSellIn() - 1);
        int decrease = (product.getSellIn() < 0) ? 2 :  1;
        product.setQuality(product.getQuality() - decrease);
        products.add(product);


    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
