package com.lt.designpattern.ptototype.hw.hw6861;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 14:09
 */
public class UnderLinePen extends Product {
    private char ch;

    public UnderLinePen(char ch) {
        this.ch = ch;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println("");
    }
}
