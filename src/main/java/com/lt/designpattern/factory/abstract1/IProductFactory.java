package com.lt.designpattern.factory.abstract1;

/**
 * @description: 顶级抽象工厂
 * @author: ~Teng~
 * @date: 2022/9/1 0:24
 */
public interface IProductFactory {
    /**
     * 生产手机
     */

    IPhoneProduct getIPhoneProduct();

    /**
     * 生产路由器
     */
    IRouterProduct getIRouterProduct();
}
