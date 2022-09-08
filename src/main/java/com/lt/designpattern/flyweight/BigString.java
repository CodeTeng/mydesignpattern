package com.lt.designpattern.flyweight;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/8 16:41
 */
public class BigString {

    private BigChar[] bigChars;

    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (BigChar bigChar : bigChars) {
            bigChar.print();
        }
    }
}
