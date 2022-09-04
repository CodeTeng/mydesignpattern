package com.lt.designpattern.facade;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/4 13:09
 */
public class HomeTheaterFacade {

    private static Computer computer;
    private static Player player;
    private static Light light;
    private static PopcornPopper popcornPopper;
    private static Projector projector;

    private HomeTheaterFacade() {
    }

    static {
        computer = new Computer();
        player = new Player();
        light = new Light();
        popcornPopper = new PopcornPopper();
        projector = new Projector();
    }

    public static void watchMovie() {
        /**
         *  1、打开爆米花机
         2、制作爆米花
         3、将灯光调暗
         4、打开投影仪
         5、放下投影仪投影区
         6、打开电脑
         7、打开播放器
         8、将播放器音调设为环绕立体声
         */
        popcornPopper.on();
        popcornPopper.make();
        light.off();
        projector.on();
        projector.lay();
        computer.on();
        player.on();
        player.adjust();
    }

}
