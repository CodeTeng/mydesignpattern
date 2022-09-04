package com.lt.designpattern.visitor;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description: 具体要访问的对象
 * @author: ~Teng~
 * @date: 2022/9/4 10:33
 */
public class Directory extends Entry {

    private String name;

    private ArrayList dir = new ArrayList();

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
        for (Object o : dir) {
            Entry entry = (Entry) o;
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        dir.add(entry);
        return this;
    }

    @Override
    public Iterator iterator() throws FileTreatmentException {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
