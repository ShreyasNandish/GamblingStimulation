package com.bridgelabz.GamblingStimulation;

import java.util.Scanner;


public class GamblingStimulation {
    static int dailyStake = 100;
    static int betInDollar = 1;
    public static final int win = 1;
    public static int totalAmountWonFor20days = 0;
    public static int totalAmountLostFor20days = 0;
    public static int dayLostCount = 0;
    public static int dayWonCount = 0;
    public static int winCount = 0;
    public static int lossCount = 0;
    public static int wonMax=0;
    public static int lostMax=0;
    static int luckyDay;
    static int unluckyDay;


    public static void dayNumber() {

        for (int day = 1; day <= 20; day++) {
            dailyStake = 100;
            System.out.println("Day Number " + day);

            while (dailyStake >50 && dailyStake <150) {
                int result = (int) ((Math.random() * 10 % 2));
                if (result == win) {
                    dailyStake+=50;
                    //System.out.println(" Won on day is " + dailyStake);
                    winCount++;
                } else {
                    dailyStake-=50;
                    //System.out.println("Lost on day is " + dailyStake);
                    lossCount++;
                }
            }

            if (dailyStake > 100) {
                totalAmountWonFor20days += 50;
                //dayWonCount++;
                if (dailyStake > wonMax) {
                    wonMax = dailyStake;
                    luckyDay = day;
                }
                System.out.println("Won on day " + day + " is " + (dailyStake - 100));
                dayWonCount++;
            } else {
                totalAmountLostFor20days -= 50;
                if (dailyStake < lostMax) {
                    lostMax = dailyStake;
                    unluckyDay = day;
                }
                System.out.println("Lost on day " + day + " is " + (dailyStake - 100));
                dayLostCount++;
            }

        }



            System.out.println("Won times " + winCount);
            System.out.println("Lost count " + lossCount);
            System.out.println("Total amount won for 20 Days is : " + totalAmountWonFor20days);
            System.out.println("Total amount lost for 20 Days is :" + totalAmountLostFor20days);

            System.out.println("Number of days lost " + dayLostCount + " by $50.");
            System.out.println("Number of days won " + dayWonCount + " by $50.");

        System.out.println("Lucky day on which the borrower won max is "+luckyDay);
        System.out.println("Unlucky day on which the borrower lost max is "+unluckyDay);

            }





    public static void main(String[] args) {
        System.out.println("Welcome To Gambling Simulator");
        dayNumber();

    }


}










