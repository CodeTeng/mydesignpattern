package com.lt.designpattern.iterator;

/**
 * @description: 集合
 * @author: ~Teng~
 * @date: 2022/7/19 22:30
 */
public interface Aggregate {

    /**
     * 返回当前的迭代器
     *
     * @return 迭代器
     */
    Iterator iterator();
}
