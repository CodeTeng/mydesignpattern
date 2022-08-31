package com.lt.designpattern.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @description: 懒汉式单例
 * @author: ~Teng~
 * @date: 2022/8/31 22:24
 */
public class LazyMan {

    private volatile static LazyMan LAZY_MAN;

    private static boolean flag = false;

    private LazyMan() {
        System.out.println(Thread.currentThread().getName());
        synchronized (LazyMan.class) {
            if (flag == false) {
                flag = true;
            } else {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }
    }

    /**
     * 单线程下是没问题的
     */
    public static LazyMan getInstance1() {
        if (LAZY_MAN == null) {
            LAZY_MAN = new LazyMan();
        }
        return LAZY_MAN;
    }

    /**
     * 双重检测锁模式 懒汉式单例 DCL
     */
    public static LazyMan getInstance2() {
        if (LAZY_MAN == null) {
            synchronized (LazyMan.class) {
                if (LAZY_MAN == null) {
                    // 不是一个原子性操作 可能会有指令重排 需要加上volatile
                    /**
                     * new 操作的步骤
                     * 1. 分配内存空间
                     * 2. 执行构造方法，初始化对象
                     * 3. 把这个对象指向这个空间
                     */
                    LAZY_MAN = new LazyMan();
                }
            }
        }
        return LAZY_MAN;
    }

    /**
     * 模拟多线程并发
     */
    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < 10; i++) {
//            new Thread(LazyMan::getInstance2).start();
//        }

        // 利用反射破坏
        LazyMan instance = LazyMan.getInstance2();

        Field field = LazyMan.class.getDeclaredField("flag");
        field.setAccessible(true);
        Constructor<LazyMan> constructor = LazyMan.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        LazyMan instance1 = constructor.newInstance();
        field.set(instance1, false);
        LazyMan instance2 = constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(instance1);

        // 再次用反射
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
