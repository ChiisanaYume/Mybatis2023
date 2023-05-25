package com.faintdream;

public class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (request.getRequestType().equals("TYPE_A")) {
            System.out.println("ConcreteHandlerA is handling the request of TYPE_A");
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
