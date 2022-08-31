package com.lt.designpattern.iterator.homework;

import com.lt.designpattern.iterator.Book;
import com.lt.designpattern.iterator.Iterator;

/**
 * @description: 练习题
 * @author: ~Teng~
 * @date: 2022/7/19 22:47
 */
public class BookShelfIteratorHome implements Iterator {

    private BookShelfHome bookShelfHome;

    private int index;

    public BookShelfIteratorHome(BookShelfHome bookShelfHome) {
        this.bookShelfHome = bookShelfHome;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelfHome.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelfHome.getBookAt(index);
        index++;
        return book;
    }
}
