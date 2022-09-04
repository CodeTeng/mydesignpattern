package com.lt.designpattern.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/4 13:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
