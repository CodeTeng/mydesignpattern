package com.lt.designpattern.composite;

import java.util.ArrayList;

/**
 * @description: Composite---复合物
 * @author: ~Teng~
 * @date: 2022/9/4 0:21
 */
public class Directory extends Entry {

    private String name;

    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Object dir : directory) {
            Entry entry = (Entry) dir;
            // 该处体现了组合模式
            size += entry.getSize();
        }
        return size;
    }


    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Object dir : directory) {
            Entry entry = (Entry) dir;
            // 体现组合模式
            entry.printList(prefix + "/" + name);
        }
    }
}
