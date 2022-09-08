package com.lt.designpattern.state;

/**
 * @description: 管理金库的状态
 * @author: ~Teng~
 * @date: 2022/9/8 16:15
 */
public interface Context {
    void setClock();

    void changeState();

    void callSecurityCenter();

    void recordingLog();
}
