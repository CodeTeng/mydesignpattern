package com.lt.designpattern.iterator.homework;

import com.lt.designpattern.iterator.Aggregate;
import com.lt.designpattern.iterator.Book;
import com.lt.designpattern.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 练习题
 * @author: ~Teng~
 * @date: 2022/7/19 22:43
 */
public class BookShelfHome implements Aggregate {

    private List<Book> list;

    public BookShelfHome(int initialSize) {
        list = new ArrayList<>(initialSize);
    }

    public Book getBookAt(int index) {
        return list.get(index);
    }

    public void appendBook(Book  book) {
        list.add(book);
    }

    public int getLength() {
        return list.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIteratorHome(this);
    }
}
