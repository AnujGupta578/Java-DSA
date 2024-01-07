package tutorials;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        int a = 0;
//        int b  = 1;
//
//        System.out.println("Fibonacci Series:" );
//
//        System.out.print(a+ ", "+ b + ",");
//
//        for(int i = 0; i < n; i++) {
//
//            int temp = a + b;
//            a = b;
//            b = temp;
//
//            System.out.print(b + " ,");
//        }

        int prev = 0;
        int next = 1;
        int count = 2;

        while(count < n) {
            int temp  = next;
            next = next + prev;
            prev = temp;
            count++;
        }
        System.out.print(next);







    }
}
