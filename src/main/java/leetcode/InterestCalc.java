package leetcode;

import java.util.Scanner;

public class InterestCalc {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter the principle amount: ");

        double p = input.nextDouble();

        System.out.println("Please enter the rate of interest: ");
        double r = input.nextDouble();

        System.out.println("Please enter the time duration in year: ");
        double t = input.nextDouble();

        getInterest(p, r, t);
    }

    public static void getInterest(double p, double r, double t) {
        double i = (p*r*t)/100 ;

        System.out.println("Total Interest: " + i);
    }
}
