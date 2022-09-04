package com.lt.designpattern.visitor;

import java.util.Iterator;

/**
 * @description: 具体的访问者
 * @author: ~Teng~
 * @date: 2022/9/4 10:40
 */
public class ListVisitor extends Visitor {

    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
