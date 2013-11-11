package com.observer.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {

    private String name;
    private List<String> noteBook;

    public Student(String name) {
        this.name = name;
        this.noteBook = new ArrayList<String>();
    }

    public List<String> getNoteBook() {
        return noteBook;
    }

    @Override
    public void update(Observable observable, Object o) {
        String time = ((ThoughtWorks) observable).recruitingTime();
        System.out.println("招聘时间定为: " + time);
        noteBook.add(time);
        System.out.println("已经同步到" + name + "的备忘录！");
    }
}
