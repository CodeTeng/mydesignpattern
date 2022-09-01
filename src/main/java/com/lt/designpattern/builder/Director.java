package com.lt.designpattern.builder;

/**
 * @description: 监工
 * @author: ~Teng~
 * @date: 2022/9/1 14:33
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.makeTitle("Hello");
        builder.makeContent("Hello内容1");
        builder.makeContent("Hello内容2");
        builder.close();
    }

}
