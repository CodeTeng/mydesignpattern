package com.lt.designpattern.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @description: 反射不能破坏枚举单例
 * @author: ~Teng~
 * @date: 2022/8/31 22:55
 */
public enum EnumSingle {

    /**
     * 单例
     */
    INSTANCE;

    public EnumSingle getInstance() {
        return INSTANCE;
    }
}

class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EnumSingle instance1 = EnumSingle.INSTANCE;
        Constructor<?>[] declaredConstructors = EnumSingle.class.getDeclaredConstructors();
        // 私有构造 两个参数
        System.out.println(Arrays.toString(declaredConstructors));
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle instance2 = declaredConstructor.newInstance();
        // throw new IllegalArgumentException("Cannot reflectively create enum objects");
        // 说明枚举不会
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
