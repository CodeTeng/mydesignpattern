package com.lt.designpattern.proxy;

/**
 * @description: 代理模式
 * @author: ~Teng~
 * @date: 2022/9/8 16:46
 */
public class Main {
    public static void main(String[] args) {
        Printable printable = new Printer("Teng");
        System.out.println("现在的名字是：" + printable.getPrinterName());
        printable.setPrinterName("MuZi");
        System.out.println("现在的名字是：" + printable.getPrinterName());
        printable.print("Hello World");
    }
}
