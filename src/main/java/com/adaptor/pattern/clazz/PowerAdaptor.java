package com.adaptor.pattern.clazz;

public class PowerAdaptor extends PowerSource {

    public Boolean charge(Mobile mobile) {
        if (convert() == mobile.getVoltage()) {
            System.out.println("charging.........");
            return true;
        } else {
            System.out.println("can not be charged!");
            return false;
        }
    }

    private int convert() {
        if (discharge() == 220) {
            return 10;
        }
        return 0;
    }

}
