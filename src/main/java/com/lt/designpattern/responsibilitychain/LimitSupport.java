package com.lt.designpattern.responsibilitychain;

/**
 * @description: 解决问题的具体类（仅处理小于执行编号的问题）
 * @author: ~Teng~
 * @date: 2022/9/4 12:35
 */
public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
