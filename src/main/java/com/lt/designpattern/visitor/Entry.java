package com.lt.designpattern.visitor;


import java.util.Iterator;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/4 10:30
 */
public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
