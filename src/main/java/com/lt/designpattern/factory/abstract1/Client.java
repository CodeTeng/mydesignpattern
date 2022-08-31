package com.lt.designpattern.factory.abstract1;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 0:28
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=================小米系列产品=================");
        XiaoMiIProductFactory xiaoMiIProductFactory = new XiaoMiIProductFactory();
        IPhoneProduct iPhoneProduct = xiaoMiIProductFactory.getIPhoneProduct();
        iPhoneProduct.callup();
        iPhoneProduct.sendSMS();

        IRouterProduct iRouterProduct1 = xiaoMiIProductFactory.getIRouterProduct();
        iRouterProduct1.openWife();

        System.out.println("=================华为系列产品=================\"");
        HuaWeiIProductFactory huaWeiIProductFactory = new HuaWeiIProductFactory();
        IRouterProduct iRouterProduct = huaWeiIProductFactory.getIRouterProduct();
        iRouterProduct.openWife();
        iRouterProduct.setting();
        IPhoneProduct iPhoneProduct1 = huaWeiIProductFactory.getIPhoneProduct();
        iPhoneProduct1.start();
    }
}
