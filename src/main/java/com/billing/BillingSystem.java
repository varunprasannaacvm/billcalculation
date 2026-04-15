package com.billing;

public class BillingSystem {
    public double calculateBill(int units) {
        if (units <= 100) return units * 5.0;
        return (100 * 5.0) + ((units - 100) * 8.0);
    }

    public static void main(String[] args) {
        BillingSystem bs = new BillingSystem();
        System.out.println("Total Bill for 120 units: " + bs.calculateBill(120));
    }
}