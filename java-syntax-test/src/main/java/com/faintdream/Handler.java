package com.faintdream;

public interface Handler {
    void setNext(Handler nextHandler);
    void handleRequest(Request request);
}
