package com.lt.designpattern.decorator;


/**
 * @description: 装饰模式
 * @author: ~Teng~
 * @date: 2022/9/4 0:33
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello，World");
        Display d2 = new SideBorder(d1, '#');
        d1.show();
        d2.show();
        Display d3 = new SideBorder(new SideBorder(new SideBorder(new StringDisplay("Helo,World"), '~'), '@'), '$');
        d3.show();
    }
}
