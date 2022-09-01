package com.lt.designpattern.ptototype.hw.hw6861;

import com.lt.designpattern.ptototype.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 14:11
 */
public class Manager {
    private Map<String, com.lt.designpattern.ptototype.Product> map = new HashMap<>();

    public void register(String name, com.lt.designpattern.ptototype.Product product) {
        map.put(name, product);
    }

    public Product create(String name) {
        return map.get(name).createClone();
    }
}
