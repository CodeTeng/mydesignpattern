package com.lt.designpattern.builder;

/**
 * @description: 抽象的建造者
 * @author: ~Teng~
 * @date: 2022/9/1 10:39
 */
public abstract class Builder {

    /**
     * 编写标题
     * @param title
     */
    public abstract void makeTitle(String title);

    /**
     * 编写内容
     * @param str
     */
    public abstract void makeContent(String str);

    /**
     * 结束编写
     */
    public abstract void close();
}
