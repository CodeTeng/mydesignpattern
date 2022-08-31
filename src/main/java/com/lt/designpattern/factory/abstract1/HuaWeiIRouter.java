package com.lt.designpattern.factory.abstract1;

/**
 * @description: 华为路由器实现
 * @author: ~Teng~
 * @date: 2022/9/1 0:23
 */
public class HuaWeiIRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openWife() {
        System.out.println("华为路由器打开Wife");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置");
    }
}
