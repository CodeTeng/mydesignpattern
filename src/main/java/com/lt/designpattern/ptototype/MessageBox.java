package com.lt.designpattern.ptototype;


/**
 * @description: 具体的原型
 * @author: ~Teng~
 * @date: 2022/9/1 13:52
 */
public class MessageBox implements Product {

    private char docochar;

    public MessageBox(char docochar) {
        this.docochar = docochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(docochar);
        }
        System.out.println("");
        System.out.println(docochar + " " + s + " " + docochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(docochar);
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
