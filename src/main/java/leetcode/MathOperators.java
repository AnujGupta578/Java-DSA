package leetcode;

import java.util.Scanner;

public class MathOperators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number > 0: ");
        int a = input.nextInt();
        System.out.println("Please enter the second number > 0: ");
        int b = input.nextInt();

        operatorCalc(a, b);
    }

    static void operatorCalc(int a, int b) {
//        Addition;
        System.out.println("Addition:  "+ (a+b));

//       Subtraction;
        System.out.println("Subtraction:  " + (a>b? (a - b) : (b-a)));

//        Multiplication
        System.out.println("Multiplication: " + a*b);

//        Division
        System.out.println("Division: " + (a>0 && b>0 && a>b ? a/b : b/a ));

    }
}
