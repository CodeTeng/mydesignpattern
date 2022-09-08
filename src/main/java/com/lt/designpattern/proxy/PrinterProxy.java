package com.lt.designpattern.proxy;

/**
 * @description: 带名字打印机的类（代理人）
 * @author: ~Teng~
 * @date: 2022/9/8 16:48
 */
public class PrinterProxy implements Printable {

    private String name;

    private Printer printer;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        if (printer != null) {
            printer.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        if (printer == null) {
            printer = new Printer(name);
        }
        printer.print(string);
    }
}
