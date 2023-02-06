package org.example;

import java.util.Date;

public class OrderBuilder implements Builder {
    String buyer;
    int price;
    String productName;
    Date date;

    @Override
    public Builder setBuyer(String buyer) {
        this.buyer = buyer;
        return this;
    }

    @Override
    public Builder setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public Builder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    @Override
    public Builder setDate(Date date) {
        this.date = date;
        return this;
    }

    public Order build() {
        return new Order(buyer, price, productName, date);
    }
}
