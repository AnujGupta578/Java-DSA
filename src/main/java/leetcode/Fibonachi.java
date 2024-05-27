package leetcode;

import java.util.Scanner;

public class Fibonachi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: 0<n>10");

        int num = sc.nextInt();

        fibbo(num);
    }

    static void fibbo(int num) {

        int last = 0;
        int next = 1;
        int count = 2;

        System.out.print(last + " " + next + " ");

        while (count<num) {
                int temp = last;
                last = next;
                next = temp + last;
                System.out.print(next + " ");
            count++;
        }


    }


}
