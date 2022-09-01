package com.lt.designpattern.builder;

/**
 * @description: 具体的建造者
 * @author: ~Teng~
 * @date: 2022/9/1 14:36
 */
public class HtmlBuilder extends Builder {
    @Override
    public void makeTitle(String title) {
        System.out.println("用HTML编写文本标题：" + title);
    }

    @Override
    public void makeContent(String str) {
        System.out.println("用HTML编写文本内容：" + str);
    }

    @Override
    public void close() {
        System.out.println("用HTML结束文本编写");
    }
}
