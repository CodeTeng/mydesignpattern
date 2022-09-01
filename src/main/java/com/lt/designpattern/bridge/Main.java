package com.lt.designpattern.bridge;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 16:41
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new CountDisplay(new StringDisplayImpl());
        d1.open();
        d1.print();
        d1.close();
        System.out.println("=================================");
        CountDisplay d2 = new CountDisplay(new StringDisplayImpl());
        d2.multiPrint(3);

        System.out.println("============================");
        RandomDisplay d3 = new RandomDisplay(new StringDisplayImpl());
        d3.randomDisplay(3);
    }
}
