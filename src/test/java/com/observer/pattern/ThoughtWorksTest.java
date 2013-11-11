package com.observer.pattern;

import org.junit.Before;
import org.junit.Test;

public class ThoughtWorksTest {
    private ThoughtWorks thoughtworks;
    private Student stu1;
    private Student stu2;
    private Student stu3;

    @Before
    public void setup() {
        stu1 = new Student("jiukun");
        stu2 = new Student("jinwen");
        stu3 = new Student("qianyu");
    }

    @Test
    public void should_notify_students_when_start_recruiting() {
        thoughtworks = new ThoughtWorks();
        thoughtworks.addObserver(stu1);
        thoughtworks.addObserver(stu2);
        thoughtworks.addObserver(stu3);

        thoughtworks.startRecruiting();
    }
}
