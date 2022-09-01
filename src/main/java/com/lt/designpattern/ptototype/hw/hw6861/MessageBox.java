package com.lt.designpattern.ptototype.hw.hw6861;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 14:11
 */
public class MessageBox extends Product {
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
}
