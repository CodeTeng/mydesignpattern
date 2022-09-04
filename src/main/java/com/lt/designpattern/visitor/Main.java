package com.lt.designpattern.visitor;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/4 10:43
 */
public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory("rootDir");
        Directory binDir = new Directory("binDir");
        Directory tmpDir = new Directory("tmpDir");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        binDir.add(new File("tengBin", 10000));
        tmpDir.add(new File("tengTmp", 20000));
        rootDir.accept(new ListVisitor());
    }
}
