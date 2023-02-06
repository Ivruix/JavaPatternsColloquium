package org.example;

import java.util.Date;

public class Order {
    private final String buyer;
    private final int price;
    private final String productName;
    private final Date date;

    public Order(String buyer, int price, String productName, Date date) {
        this.buyer = buyer;
        this.price = price;
        this.productName = productName;
        this.date = date;
    }

    public String getBuyer() {
        return buyer;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public String getProductName() {
        return productName;
    }
}
