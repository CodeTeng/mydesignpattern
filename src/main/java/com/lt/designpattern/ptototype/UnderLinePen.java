package com.lt.designpattern.ptototype;

/**
 * @description: 具体的原型
 * @author: ~Teng~
 * @date: 2022/9/1 13:49
 */
public class UnderLinePen implements Product {

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

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
