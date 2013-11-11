package com.adaptor.pattern.instance;

public class PowerAdaptor {
    private final PowerSource powerSource;

    public PowerAdaptor(PowerSource powerSource) {
        this.powerSource = powerSource;
    }

    public Boolean charge(Mobile mobile) {
        if (convert(powerSource.discharge()) == mobile.getVoltage()) {
            System.out.print("charging....");
            return true;
        } else {
            System.out.println("can not be charged!");
            return false;
        }
    }

    private int convert(int voltage) {
        if (voltage == 220) {
            return 10;
        }
        return 0;
    }

}
