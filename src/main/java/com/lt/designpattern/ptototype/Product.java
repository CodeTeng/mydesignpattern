package com.lt.designpattern.ptototype;

/**
 * @description: 原型
 * @author: ~Teng~
 * @date: 2022/9/1 13:48
 */
public interface Product extends Cloneable {
    void use(String name);

    Product createClone();
}
