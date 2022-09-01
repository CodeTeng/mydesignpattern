package com.lt.designpattern.ptototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 使用者
 * @author: ~Teng~
 * @date: 2022/9/1 13:54
 */
public class Manager {
    private Map<String, Product> map = new HashMap<>();

    public void register(String name, Product product) {
        map.put(name, product);
    }

    public Product create(String name) {
        return map.get(name).createClone();
    }
}
