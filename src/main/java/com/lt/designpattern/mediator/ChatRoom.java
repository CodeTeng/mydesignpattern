package com.lt.designpattern.mediator;

import java.util.Date;

/**
 * @description: 中介类
 * @author: ~Teng~
 * @date: 2022/9/4 13:51
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
