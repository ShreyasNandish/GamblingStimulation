package com.bridgelabz.GamblingStimulation;

public class GamblingStimulation {
    static int dailyStake = 100;
    static int betInDollar = 1;
    public static final int win = 1;
    public static int totalAmountWonFor20days = 0;
    public static int totalAmountLostFor20days = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Gambling Simulator");

        for (int day = 1; day <= 20; day++) {

            while (dailyStake >= 49 && dailyStake <= 149) {
                int result = (int) ((Math.random() * 10 % 2) + 1);
                if (result == win) {
                    dailyStake++;
                    System.out.println("Won");
                } else {
                    dailyStake--;
                    System.out.println("Loose");
                }

                if (dailyStake == 150) {
                    totalAmountWonFor20days += 50;
                } else if (dailyStake == 50) {
                    totalAmountLostFor20days -= 50;
                }

            }
        }
            System.out.println("Total amount won for 20 Days is : " + totalAmountWonFor20days);
            System.out.println("Total amount lost for 20 Days is :" + totalAmountLostFor20days);
        }
    }

