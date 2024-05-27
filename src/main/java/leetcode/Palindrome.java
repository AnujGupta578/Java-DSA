package leetcode;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to check if palindrome or not: ");

        String input = sc.nextLine();

        System.out.println(palindrome(input));
        System.out.println(palindromeForloop(input));

    }

//    using while loop
    public static boolean palindrome(String in) {
        int i = 0;
        while(i < in.length()/2) {
            if(!isEqual(in, i, in.length() - 1 - i)) {
                return false;
            };
            i++;
        }
        return true;
    }

    public static boolean isEqual(String in, int firstIn, int lastIn) {
        String toLowerCaseStr = in.toLowerCase();
        return toLowerCaseStr.charAt(firstIn) == toLowerCaseStr.charAt(lastIn);

    }

    //    using for loop
    public static boolean palindromeForloop(String in) {
        String loweCase = in.toLowerCase();
        for (int i = 0; i < loweCase.length()/2; i++) {

            char start = loweCase.charAt(i);
            char end = loweCase.charAt(loweCase.length() - 1 - i);

            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
