package com.lt.designpattern.visitor;


/**
 * @description: 具体要访问的对象
 * @author: ~Teng~
 * @date: 2022/9/4 10:33
 */
public class File extends Entry {

    private String name;

    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
