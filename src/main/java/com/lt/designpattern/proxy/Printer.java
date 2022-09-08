package com.lt.designpattern.proxy;

/**
 * @description: 带名字的打印机的类（本人）
 * @author: ~Teng~
 * @date: 2022/9/8 16:47
 */
public class Printer implements Printable {
    private String name;

    public Printer() {
        System.out.println("正在生成实例");
    }

    public Printer(String name) {
        this.name = name;
        System.out.println("正在生成" + this.name + "的实例");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        System.out.println("===" + this.name + "===");
        System.out.println(string);
    }
}
