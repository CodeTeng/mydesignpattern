package com.lt.designpattern.iterator;

/**
 * @description: 迭代器
 * @author: ~Teng~
 * @date: 2022/7/19 22:30
 */
public interface Iterator {
    /**
     * 确认接下来是否可以调用next方法
     *
     * @return true or false
     */
    boolean hasNext();

    /**
     * 返回当前元素并指向下一个元素
     *
     * @return 当前元素
     */
    Object next();
}
