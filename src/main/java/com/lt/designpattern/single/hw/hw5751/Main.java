package com.lt.designpattern.single.hw.hw5751;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 13:25
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMarker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");
    }
}
