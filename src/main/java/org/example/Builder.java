package org.example;

import java.util.Date;

public interface Builder {
    Builder setBuyer(String buyer);
    Builder setPrice(int price);
    Builder setProductName(String productName);
    Builder setDate(Date date);
    Order build();
}
