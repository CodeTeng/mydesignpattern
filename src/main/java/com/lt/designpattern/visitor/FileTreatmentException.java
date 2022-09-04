package com.lt.designpattern.visitor;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/4 10:31
 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }

    public FileTreatmentException(String msg) {
        super(msg);
    }
}
