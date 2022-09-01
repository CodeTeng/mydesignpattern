package com.lt.designpattern.templatemethod;

/**
 * @description: 具体类
 * @author: ~Teng~
 * @date: 2022/9/1 12:54
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
