package com.lt.designpattern.composite;

/**
 * @description: 组合模式测试
 * @author: ~Teng~
 * @date: 2022/9/4 0:26
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
        rootDir.printList();
    }
}
