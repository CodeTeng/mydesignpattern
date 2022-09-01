package com.lt.designpattern.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: Adaptee（被适配角色）
 * @author: ~Teng~
 * @date: 2022/7/19 23:09
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Banner {
    private String name;

    public void showWithParen() {
        System.out.println("(" + name + ")");
    }

    public void showWithAster() {
        System.out.println("*" + name + "*");
    }
}
