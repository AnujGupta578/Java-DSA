package tutorials;

import java.util.Scanner;

public class DuplicateNumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int findNumber = sc.nextInt();
        int count = 0;

        while (n > 0) {
            int remender = n%10;

            if(remender == findNumber) {
                count++;
            }

            n = n/10;

        }

        System.out.println("Total repeation " + count);
    }
}
