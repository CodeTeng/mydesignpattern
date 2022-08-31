package com.lt.designpattern.iterator;

/**
 * @description: 具体的集合 （书架）
 * @author: ~Teng~
 * @date: 2022/7/19 22:34
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last++] = book;
    }

    public int getLength() {
        return last;
    }

    /**
     * 实现具体的迭代器
     *
     * @return 具体的迭代器
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
