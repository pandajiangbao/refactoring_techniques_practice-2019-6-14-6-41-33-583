package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private static final Integer QUANTITY_MAX=500;
    private static final Double DISCOUNT_RATE=0.05;
    double getPrice(int quantity, int itemPrice) {
        double basePrice = quantity * itemPrice;
        double discount = Math.max(0, quantity - QUANTITY_MAX) * itemPrice * DISCOUNT_RATE;
        double shippingCost = Math.min(quantity * itemPrice * 0.1, 100.0);
        return basePrice - discount + shippingCost;
    }
}
