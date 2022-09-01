package com.lt.designpattern.ptototype.hw.hw6861;

import com.lt.designpattern.ptototype.Manager;
import com.lt.designpattern.ptototype.MessageBox;
import com.lt.designpattern.ptototype.Product;
import com.lt.designpattern.ptototype.UnderLinePen;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 14:11
 */
public class Main {
    public static void main(String[] args) {
        // 准备
        com.lt.designpattern.ptototype.Manager manager = new Manager();
        com.lt.designpattern.ptototype.UnderLinePen underLinePen = new UnderLinePen('~');
        com.lt.designpattern.ptototype.MessageBox messageBox = new MessageBox('*');
        manager.register("underlinePen", underLinePen);
        manager.register("messageBox", messageBox);

        // 生成
        com.lt.designpattern.ptototype.Product p1 = manager.create("underlinePen");
        p1.use("Hello World");
        Product p2 = manager.create("messageBox");
        p2.use("Hello World");
    }
}
