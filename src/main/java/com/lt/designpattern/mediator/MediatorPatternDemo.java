package com.lt.designpattern.mediator;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/4 13:52
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
