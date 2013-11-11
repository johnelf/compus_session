package com.adaptor.pattern.instance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MobileTest {
    private Mobile iphone;
    private Mobile sumsung;
    private PowerAdaptor powerAdaptor;
    private PowerSource powerSource;

    @Before
    public void setup() {
        powerSource = new PowerSource();
        iphone = new Mobile("iphone", 10);
        sumsung = new Mobile("sumsung", 20);
        powerAdaptor = new PowerAdaptor(powerSource);
    }

    @Test
    public void mobile_should_be_charged() {
        System.out.println(iphone.getName() + ": " + iphone.getVoltage() + "v");
        assertTrue(powerAdaptor.charge(iphone));
    }

    @Test
    public void mobile_should_not_be_charged() {
        System.out.println(sumsung.getName() + ": " + sumsung.getVoltage() + "v");
        assertFalse(powerAdaptor.charge(sumsung));
    }

}
