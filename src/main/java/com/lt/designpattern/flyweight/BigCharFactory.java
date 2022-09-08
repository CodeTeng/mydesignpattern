package com.lt.designpattern.flyweight;

import java.util.HashMap;
import java.util.Objects;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/8 16:38
 */
public class BigCharFactory {
    private HashMap pool = new HashMap();

    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bc = (BigChar) pool.get("" + charName);
        if (Objects.isNull(bc)) {
            bc = new BigChar(charName);
            pool.put("" + charName, bc);
        }
        return bc;
    }
}
