package com.lt.designpattern.ptototype;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 13:56
 */
public class Main {
    public static void main(String[] args) {
        // 准备
        Manager manager = new Manager();
        UnderLinePen underLinePen = new UnderLinePen('~');
        MessageBox messageBox = new MessageBox('*');
        manager.register("underlinePen", underLinePen);
        manager.register("messageBox", messageBox);

        // 生成
        Product p1 = manager.create("underlinePen");
        p1.use("Hello World");
        Product p2 = manager.create("messageBox");
        p2.use("Hello World");
    }
}
