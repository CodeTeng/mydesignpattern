package com.lt.designpattern.adapter.extend;

/**
 * @description: 继承模式下的请求者
 * @author: ~Teng~
 * @date: 2022/7/19 23:15
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter("hello");
        // 实现了需求
        print.printWeak();
        print.printStrong();
    }
}
