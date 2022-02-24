package com.blz.gambler;

public class GamblerSimulator {
    public static final int DAY_STAKE = 100;
    public static final int BET = 1;

    public static void main(String[] args) {
        int totalCsh = DAY_STAKE;
        System.out.println("Initial Stake is " + DAY_STAKE + "$  and Bet is " + BET + "$ ");

        int bet = (int) (Math.floor(Math.random() * 10) % 2);
        if (bet == 1) {
            System.out.println("WON $1");
        } else {
            System.out.println("LOOSE $1");
        }
    }
}
