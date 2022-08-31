package com.lt.designpattern.factory.abstract1;

/**
 * @description: 华为产品工厂
 * @author: ~Teng~
 * @date: 2022/9/1 0:25
 */
public class HuaWeiIProductFactory implements IProductFactory {
    @Override
    public IPhoneProduct getIPhoneProduct() {
        return new HuaWeiIPhone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new HuaWeiIRouter();
    }
}
