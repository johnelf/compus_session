package com.template.pattern;

public abstract class AbstractController implements Controller {
    @Override
    public void doGet() {
        extractParameters();
        validParameters();
        handleRequest();
    }

    protected abstract void handleRequest();

    private void extractParameters() {
        //TODO extract parameters
    }

    protected void validParameters() {
    }


}
