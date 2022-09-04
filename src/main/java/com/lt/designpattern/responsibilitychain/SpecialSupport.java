package com.lt.designpattern.responsibilitychain;

/**
 * @description: 解决问题的具体类（解决指定编号的问题）
 * @author: ~Teng~
 * @date: 2022/9/4 12:36
 */
public class SpecialSupport extends Support {

    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == this.number;
    }
}
