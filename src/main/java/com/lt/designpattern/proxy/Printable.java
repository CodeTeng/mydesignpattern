package com.lt.designpattern.proxy;

/**
 * @description: 本人和代理人的共同接口
 * @author: ~Teng~
 * @date: 2022/9/8 16:49
 */
public interface Printable {
    void setPrinterName(String name);

    String getPrinterName();

    void print(String string);
}
