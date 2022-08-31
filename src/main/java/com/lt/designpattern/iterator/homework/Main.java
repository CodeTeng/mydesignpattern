package com.lt.designpattern.iterator.homework;

import com.lt.designpattern.iterator.Book;
import com.lt.designpattern.iterator.Iterator;

/**
 * @description: 练习题测试
 * @author: ~Teng~
 * @date: 2022/7/19 22:50
 */
public class Main {
    public static void main(String[] args) {
        BookShelfHome bookShelfHome = new BookShelfHome(2);
        bookShelfHome.appendBook(new Book("哈姆雷特1"));
        bookShelfHome.appendBook(new Book("哈姆雷特2"));
        bookShelfHome.appendBook(new Book("哈姆雷特3"));
        bookShelfHome.appendBook(new Book("哈姆雷特4"));
        Iterator it = bookShelfHome.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
