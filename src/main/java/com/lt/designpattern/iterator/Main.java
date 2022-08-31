package com.lt.designpattern.iterator;

/**
 * @description: Iterator模式入口
 * @author: ~Teng~
 * @date: 2022/7/19 22:19
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("哈姆雷特1"));
        bookShelf.appendBook(new Book("哈姆雷特2"));
        bookShelf.appendBook(new Book("哈姆雷特3"));
        bookShelf.appendBook(new Book("哈姆雷特4"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
