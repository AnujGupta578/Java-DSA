package leetcode;

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two number a and b: ");

        int a = input.nextInt();
        int b = input.nextInt();
        largestNum(a, b);

    }

    public static void largestNum(int a, int b) {
        int num = 0;

        num = a> b?a:b;
        System.out.println("Largest number is: " + num);


    }
}
