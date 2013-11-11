package com.proxy.pattern.staticproxy;

public class WriteComment implements Comment {

    @Override
    public Boolean writeComment(String comment) {
        System.out.println("connecting to DB");
        System.out.println("updating");
        System.out.println("Your comment has been added!");
        return true;
    }
}
