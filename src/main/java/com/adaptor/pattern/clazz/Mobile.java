package com.adaptor.pattern.clazz;

public class Mobile {
    private final String name;

    private final int voltage;

    public Mobile(String name, int voltage) {
        this.name = name;
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public String getName() {
        return name;
    }
}
