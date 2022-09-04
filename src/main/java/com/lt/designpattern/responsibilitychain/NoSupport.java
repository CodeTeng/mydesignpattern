package com.lt.designpattern.responsibilitychain;

/**
 * @description: 解决问题的具体类（用不解决）
 * @author: ~Teng~
 * @date: 2022/9/4 12:35
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
