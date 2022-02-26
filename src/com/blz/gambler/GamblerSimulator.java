package com.blz.gambler;

public class GamblerSimulator {
    public static final int DAY_STAKE = 100;
    public static final int BET = 1;
    public static final int PERCENTAGE_50 = 50; //(DAY_STAKE / 100) * 50;
    public static final int WINNING_MARGIN = DAY_STAKE + PERCENTAGE_50;
    public static final int LOSING_MARGIN = DAY_STAKE - PERCENTAGE_50;
    public static final int MONTH_DAY = 30;
    public static final int STAKES_PER_DAY = 50;

    public static void main(String[] args) {
        int days = 1;
        int totalDollars = 0;
        int count = 0;
        int wonCount = 0;
        int lostCount = 0;
        int maxWonCount = 0;
        int maxLostCount = 0;

        System.out.println("Initial Stake is " + DAY_STAKE + "$  and Bet is " + BET + "$ ");
        //Calculate for Month,to know gamblers stake each day
        for (days = 1; days <= MONTH_DAY; days++) {
            int totalCash = DAY_STAKE;
            //Either earn 150 or loose 50
            while (totalCash < WINNING_MARGIN && totalCash > LOSING_MARGIN) {
                //Initialising Random number for Win or Loose
                int bet = (int) (Math.floor(Math.random() * 10) % 2);
                System.out.println(bet);
                if (bet == 1) {
                    totalCash += BET;//stake will increase
                    wonCount++;
                    if (maxWonCount < wonCount) {
                        maxWonCount = wonCount;
                    }
                } else {
                    totalCash -= BET;//stake will decrease
                    lostCount++;
                    if (maxLostCount < lostCount) {
                        maxLostCount = lostCount;
                    }
                }
                count++;
            }
            if (totalCash == WINNING_MARGIN) {
                totalDollars += STAKES_PER_DAY;
                System.out.println("Gambler WON by " + totalDollars + " on day" + days);
            } else {
                totalDollars -= STAKES_PER_DAY;
                System.out.println("Gambler LOST by " + totalDollars + " on day" + days);
            }
        }
        if (totalDollars > 0) {
            System.out.println("Gambler is won the " + totalDollars + " and Luckiest  " + maxWonCount + " Unluckiest " + maxLostCount + " maximum won out of " + count);
        } else {
            System.out.println("Gambler is lost the " + totalDollars + " and Unluckiest " + maxLostCount + " Unluckiest " + maxWonCount + " maximum lost out of " + count);
        }
    }
    }


