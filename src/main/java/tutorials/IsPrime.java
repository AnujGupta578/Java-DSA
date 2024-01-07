package tutorials;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        System.out.println(checkPrime(n));


//        printArmstranged(n);
        allThreeDigitsArmNum();
    }

    static boolean checkPrime(int n) {
        int c = 2;

        if(n <=1) {
            return false;
        }

        while(c * c <= n) {
            if(n%c == 0) {
                return false;
            }
            c++;

        }

        return c * c > n;

    }

//    print all three armstranged numbers

    static void allThreeDigitsArmNum() {

        for(int i = 100; i<10000; i++) {
            if(printArmstranged(i)) {
                System.out.println(i);
            }
        }

    }

    static boolean printArmstranged(int n) {

        double sum = 0;
        int temp = n;

        while(n > 0) {
            int rem = n%10;
            sum = sum + Math.pow(rem, 3);
             n = n/10;
        }

        return sum == temp;
    }
}
