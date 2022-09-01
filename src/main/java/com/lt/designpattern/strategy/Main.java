package com.lt.designpattern.strategy;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/1 17:44
 */
public class Main {
    public static void main(String[] args) {
        int seed1 = 10;
        int seed2 = 20;
        Player player1 = new Player("Player1", new WinningStrategy(seed1));
        Player player2 = new Player("Player2", new ProbStrategy(seed2));
        for (int i = 0; i < 5; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner：" + player2);
                player2.win();
                player1.lose();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }

        }
        System.out.println("==============================");
        System.out.println(player1);
        System.out.println(player2);
    }
}
