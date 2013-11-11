package com.proxy.pattern.staticproxy;

public class VisitorProxy extends AbstractComment{
    private Comment comment;

    public VisitorProxy(Comment comment) {
        this.comment = comment;
    }

    @Override
    public Boolean writeComment(String content) {
        System.out.println("be ready to write comment.");
        if (comment.writeComment(content)) {
            System.out.println("write comment successfully");
            return true;
        } else {
            System.out.println("fail to write comment.");
            return false;
        }
    }
}
