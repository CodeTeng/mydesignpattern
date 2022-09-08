package com.lt.designpattern.command;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/8 17:06
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("不执行命令");
    }
}
