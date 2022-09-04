package com.lt.designpattern.visitor;

/**
 * @description: 访问者的抽象类---访问者
 * @author: ~Teng~
 * @date: 2022/9/4 10:27
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
