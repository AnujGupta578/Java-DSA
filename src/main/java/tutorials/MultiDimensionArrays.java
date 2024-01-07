package tutorials;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.print("Please enter the size of row:");
//        int rowLength = sc.nextInt();

        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for(int row = 0; row < arr.length; row++) {

            for(int col =0; col<arr[row].length; col++ ) {
                arr[row][col] = in.nextInt();
            }
        }

//        for(int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
////            for(int col =0; col<arr[row].length; col++ ) {
////                System.out.print(arr[row][col] + " ");
////            }
////            System.out.println();
//        }

//        or
        for(int[] n: arr) {
            System.out.println(Arrays.toString(n));
        }
    }
}
