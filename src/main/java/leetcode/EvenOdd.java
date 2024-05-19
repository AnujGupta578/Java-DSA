package leetcode;

import java.util.Scanner;

//1. Write a program to print whether a number is even or odd, also take
// input from the user.
public class EvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int number = input.nextInt();
        if(number != 0) {
            evenOdd(number);
        }

    }

    static void evenOdd(int num) {
        if(num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
