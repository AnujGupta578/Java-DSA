package tutorials;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int res = 0;

        while(num> 0) {
            int rem = num % 10;

            res = res * 10 + rem;
            num /=10;

        }
        System.out.print(res);

    }
}
