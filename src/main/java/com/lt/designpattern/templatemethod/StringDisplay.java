package com.lt.designpattern.templatemethod;

import java.nio.charset.StandardCharsets;

/**
 * @description: 具体类
 * @author: ~Teng~
 * @date: 2022/9/1 12:55
 */
public class StringDisplay extends AbstractDisplay {

    private String str;

    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
