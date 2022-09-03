package com.lt.designpattern.decorator;

/**
 * @description: 显示多行字符串的抽象类---核心角色
 * @author: ~Teng~
 * @date: 2022/9/4 0:34
 */
public abstract class Display {

    /**
     * 获取横向的字符数
     */
    public abstract int getColumns();

    /**
     * 获取纵向行数
     */
    public abstract int getRows();

    /**
     * 获取第row行的字符串
     */
    public abstract String getRowText(int row);

    public final void show() {
        // 利用抽象方法设计模式
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
