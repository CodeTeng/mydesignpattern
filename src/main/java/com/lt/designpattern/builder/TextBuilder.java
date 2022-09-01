package com.lt.designpattern.builder;

/**
 * @description: 具体的建造者
 * @author: ~Teng~
 * @date: 2022/9/1 14:34
 */
public class TextBuilder extends Builder {
    @Override
    public void makeTitle(String title) {
        System.out.println("用普通文本编写标题：" + title);
    }

    @Override
    public void makeContent(String str) {
        System.out.println("用普通文本编写内容：" + str);
    }

    @Override
    public void close() {
        System.out.println("用普通文本结束编写");
    }
}
