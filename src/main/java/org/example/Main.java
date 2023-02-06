package org.example;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setBuyer("John")
                .setPrice(1200)
                .setProductName("Laptop")
                .setDate(new Date(2006, Calendar.MAY, 17, 13, 34, 14))
                .build();
        
        System.out.printf("Order buyer: %s%n", order.getBuyer());
        System.out.printf("Order price: %d%n", order.getPrice());
        System.out.printf("Order product name: %s%n", order.getProductName());
        System.out.printf("Order date: %tc %n", order.getDate());
    }
}