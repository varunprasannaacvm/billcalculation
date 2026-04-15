package com.billing;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BillingSystemTest {
    @Test
    public void testCalculation() {
        BillingSystem bs = new BillingSystem();
        assertEquals(660.0, bs.calculateBill(120), 0.01);
    }
}