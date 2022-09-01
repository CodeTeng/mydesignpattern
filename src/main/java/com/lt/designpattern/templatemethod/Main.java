package com.lt.designpattern.templatemethod;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 12:57
 */
public class Main {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('X');
        StringDisplay stringDisplay = new StringDisplay("Hello,World");
        charDisplay.display();
        stringDisplay.display();
        /**
         * <<XXXXX>>
         * +-----------+
         * |Hello,World|
         * |Hello,World|
         * |Hello,World|
         * |Hello,World|
         * |Hello,World|
         * +-----------+
         */
    }
}
