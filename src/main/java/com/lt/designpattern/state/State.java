package com.lt.designpattern.state;

/**
 * @description: 金库状态的接口
 * @author: ~Teng~
 * @date: 2022/9/8 16:14
 */
public interface State {
    void doClock(Context context, int hour);

    void doUser(Context context);

    void doAlarm(Context context);

    void doPhone(Context context);
}
