package com.lt.designpattern.decorator;

/**
 * @description: 显示单行字符串的类
 * @author: ~Teng~
 * @date: 2022/9/4 0:38
 */
public class StringDisplay extends Display {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
