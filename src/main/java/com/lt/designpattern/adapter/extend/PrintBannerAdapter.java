package com.lt.designpattern.adapter.extend;

import com.lt.designpattern.adapter.Banner;

/**
 * @description: 继承模式下的适配器
 * @author: ~Teng~
 * @date: 2022/7/19 23:13
 */
public class PrintBannerAdapter extends Banner implements Print {

    public PrintBannerAdapter(String name) {
        super(name);
    }

    @Override
    public void printWeak() {
        // 调用被适配的方法
        showWithParen();
    }

    @Override
    public void printStrong() {
        // 调用被适配的方法
        showWithAster();
    }
}
