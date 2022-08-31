package com.lt.designpattern.factory.abstract1;

/**
 * @description: 小米产品工厂
 * @author: ~Teng~
 * @date: 2022/9/1 0:24
 */
public class XiaoMiIProductFactory implements IProductFactory {
    @Override
    public IPhoneProduct getIPhoneProduct() {
        return new XiaoMiIPhone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new XiaoMiIRouter();
    }
}
