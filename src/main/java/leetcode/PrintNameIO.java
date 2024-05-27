package leetcode;

import java.util.Scanner;

public class PrintNameIO {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        printName(name);
    }

    static void printName(String name) {
        System.out.println("Hello My Name is " + name);
    }
}
