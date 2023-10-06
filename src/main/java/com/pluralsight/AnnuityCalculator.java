package com.pluralsight;

import java.util.Scanner;

public class AnnuityCalculator {
    // Annuity Calculator
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the monthly payout?: ");
        double payout = myScanner.nextDouble();
        System.out.println(payout);

        System.out.println("What is the interest?: ");
        double interest = myScanner.nextDouble();
        System.out.println(interest);

        System.out.println("How many years?: ");
        double years = myScanner.nextDouble();
        System.out.println(years);

        interest /= 1200;
        double totalPayout = payout * ((1 - Math.pow((1 + interest) , (- 1 * years * 12))) / interest);
        System.out.printf("Total payout is: %.2f" , totalPayout);


    }
}
