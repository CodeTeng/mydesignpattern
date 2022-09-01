package com.lt.designpattern.builder;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 14:37
 */
public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director1 = new Director(textBuilder);
        director1.build();
        HtmlBuilder htmlBuilder = new HtmlBuilder();
        Director director2 = new Director(htmlBuilder);
        director2.build();
    }
}
