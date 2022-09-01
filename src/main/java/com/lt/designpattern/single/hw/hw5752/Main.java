package com.lt.designpattern.single.hw.hw5752;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 13:31
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 9; i++) {
            Tripe instance = Tripe.getInstance(i % 3);
            System.out.println(instance);
        }
        System.out.println("End.");
    }
}
