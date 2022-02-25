package com.blz.gambler;

public class GamblerSimulator {
    public static final int DAY_STAKE = 100;
    public static final int BET = 1;
    public static final int PERCENTAGE_50 = 50; //(DAY_STAKE / 100) * 50;
    public static final int Winning_resign = DAY_STAKE + PERCENTAGE_50;
    public static final int Losing_resign = DAY_STAKE - PERCENTAGE_50;
    public static final int START_DAY = 1;
    public static final int MAXIMUM_DAY = 20;
    public static final int STAKES_PER_DAY = 50;
    public static final int START_DOLLARS = 0;

    public static void main(String[] args) {
        int days = START_DAY;
        int totalCash = DAY_STAKE;
        int totalDollars = START_DOLLARS;

        System.out.println("Initial Stake is " + DAY_STAKE + "$  and Bet is " + BET + "$ ");
        for (days = START_DAY; days <= MAXIMUM_DAY; days++) {

            while (totalCash < Winning_resign && totalCash > Losing_resign) {
                int bet = (int) (Math.floor(Math.random() * 10) % 2);
                System.out.println(bet);
                if (bet == 1) {
                    totalCash += BET;
                    System.out.println("Gambler WON the bet  " + totalCash);
                } else {
                    totalCash -= BET;
                    System.out.println("Gambler LOST the bet " + totalCash);
                }
            }
            if (totalCash == Winning_resign) {
                totalDollars += STAKES_PER_DAY;
                System.out.println("Gambler WON by " + totalCash);
            } else {
                totalDollars -= STAKES_PER_DAY;
                System.out.println("Gambler LOST by " + totalCash);
            }
        }
        if (totalDollars > START_DOLLARS) {
            System.out.println("Gambler is won the " + totalDollars);
        } else {
            System.out.println("Gambler is lost the " + totalDollars);
        }
    }
}

