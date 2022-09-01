package com.lt.designpattern.ptototype.hw.hw6861;

/**
 * @description: 习题6-1
 * @author: ~Teng~
 * @date: 2022/9/1 14:08
 */
public abstract class Product implements Cloneable {
    public abstract void use(String str);

    /**
     * 模板方法---Template Method模式
     */
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
