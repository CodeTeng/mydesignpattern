package com.lt.designpattern.adapter.Entrust;

import com.lt.designpattern.adapter.Banner;

/**
 * @description: 委托模式下的适配器
 * @author: ~Teng~
 * @date: 2022/7/19 23:16
 */
public class PrintBannerAdapter extends Print {

    private Banner banner;

    public PrintBannerAdapter(String name) {
        banner = new Banner(name);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
