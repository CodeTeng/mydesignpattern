package com.lt.designpattern.responsibilitychain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 发生问题的类
 * @author: ~Teng~
 * @date: 2022/9/4 12:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trouble {
    /**
     * 问题的编号
     */
    private int number;
}
