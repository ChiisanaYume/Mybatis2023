package com.faintdream;

public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNext(handlerB);

        Request request1 = new Request("TYPE_A");
        handlerA.handleRequest(request1);

        Request request2 = new Request("TYPE_B");
        handlerA.handleRequest(request2);

        Request request3 = new Request("TYPE_C");
        handlerA.handleRequest(request3);
    }
}

/**
 * 责任链适用于这种情况，A处理问题(Request)--> 能解决 --> 解决问题
 *                                   --> 不能解决 --> 扔给B(nextHandler) --> 能解决 --> 解决问题
 *                                                                     --> 不能解决 --> 扔给C(nextHandler) --> C不存在，完犊子
 * */

