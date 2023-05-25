package com.faintdream;

public class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (request.getRequestType().equals("TYPE_B")) {
            System.out.println("ConcreteHandlerB is handling the request of TYPE_B");
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
