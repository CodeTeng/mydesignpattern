package com.lt.designpattern.visitor;

/**
 * @description: 接受访问者访问的接口---访问者访问的对象
 * @author: ~Teng~
 * @date: 2022/9/4 10:29
 */
public interface Element {
    void accept(Visitor visitor);
}
