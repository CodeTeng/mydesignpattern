package com.lt.designpattern.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/8 16:35
 */
public class BigChar {

    private char charName;

    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charName + ".txt"));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
            reader.close();
            this.fontData = stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
