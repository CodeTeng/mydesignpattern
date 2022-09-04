package com.lt.designpattern.responsibilitychain;

/**
 * @description: 解决问题的具体类（仅处理奇数号的问题）
 * @author: ~Teng~
 * @date: 2022/9/4 12:36
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
