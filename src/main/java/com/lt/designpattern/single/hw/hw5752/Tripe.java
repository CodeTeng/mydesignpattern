package com.lt.designpattern.single.hw.hw5752;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 13:27
 */
public class Tripe {

    private int id;

    private Tripe(int id) {
        this.id = id;
    }

    private static Tripe[] tripes = new Tripe[]{
            new Tripe(0),
            new Tripe(1),
            new Tripe(2)
    };


    public static Tripe getInstance(int id) {
        return tripes[id];
    }

    @Override
    public String toString() {
        return "Tripe{" +
                "id=" + id +
                '}';
    }
}
