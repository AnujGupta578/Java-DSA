package tutorials;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ans = 0;

        while(true) {

            System.out.print("Please enter the operator:");
            Character op  = in.next().trim().charAt(0);

            System.out.println();

            if(op == '+' || op == '-' || op =='*' || op == '/' || op == '%') {
                System.out.print("Please enter 2 numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1%num2;
                }

            } else if (op == 'X' || op =='x') {
                break;
            }else {
                System.out.println("Invalid operation");
            }
            System.out.println("Answer is:"+ ans);
        }

    }
}
