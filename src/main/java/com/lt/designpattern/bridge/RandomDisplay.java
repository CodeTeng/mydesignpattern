package com.lt.designpattern.bridge;

import java.util.Random;

/**
 * @description: 增加新功能时只需要在类的功能层次结构上增加即可---改善后的抽象化2
 * @author: ~Teng~
 * @date: 2022/9/1 16:51
 */
public class RandomDisplay extends CountDisplay {

    private Random random = new Random();

    public RandomDisplay(DisplayImpl display) {
        super(display);
    }

    public void randomDisplay(int times) {
        multiPrint(random.nextInt(times));
    }
}
