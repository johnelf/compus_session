package com.observer.pattern;

import java.util.Date;
import java.util.Observable;

public class ThoughtWorks extends Observable {

    public void startRecruiting() {
        System.out.println("开始校园招聘");
        this.setChanged();
        this.notifyObservers();
    }

    public String recruitingTime() {
        return new Date().toString();
    }

}
