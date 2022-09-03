package com.lt.designpattern.decorator;

/**
 * @description: 具体的装饰边框---具体的装饰物
 * @author: ~Teng~
 * @date: 2022/9/4 0:44
 */
public class SideBorder extends Border {

    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
