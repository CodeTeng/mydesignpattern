package com.lt.designpattern.single.hw.hw5751;

/**
 * @description: 习题5-1
 * @author: ~Teng~
 * @date: 2022/9/1 13:23
 */
public class TicketMarker {
    private int ticket = 1000;

    private static TicketMarker ticketMarker = new TicketMarker();

    private TicketMarker() {
    }

    public static TicketMarker getInstance() {
        return ticketMarker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
