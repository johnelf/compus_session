package com.template.pattern;

public class UserController extends AbstractController {
    @Override
    protected void handleRequest() {
        System.out.println("handle request");
    }
}
