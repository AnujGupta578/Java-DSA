package tutorials.linearSearch;


import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 12, 15, 100, 18, 20},
                {22, 24, 26, 28},
                {32, 34, 36},
                {50, 53, 59, 58}
        };

        int target = 59;

        boolean isFound = searchIn2DArr(arr, target);
        System.out.println("Search Iteam: " + isFound);

        int[] rowOfColumn = searchIndexIn2DArr(arr, target);
        System.out.println("Here is row th Column: "+ Arrays.toString(rowOfColumn));

        int maxEle = searchMaxIn2DArr(arr);
        System.out.println("Maximum value: " + maxEle);

        int minEle = searchMinIn2DArr(arr);
        System.out.println("Minimum value: " + minEle);

    }

//    check
    static boolean searchIn2DArr(int[][] arr, int target) {
        if(arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int ele = arr[i][j];
                if(ele == target) {
                    return true;
                }

            }
        }
        return false;
    }

    static int[] searchIndexIn2DArr(int[][] arr, int target) {
        if(arr.length == 0) {
            return new int[] {-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int ele = arr[i][j];
                if(ele == target) {
//                    int[] foundArr = new int[2];
//                    foundArr[0] = i;
//                    foundArr[1] = j;
//                    return foundArr;

//                    or we can return a row and column

                    return new int[] {i, j};
                }

            }
        }
        return new int[] {-1, -1};
    }


    static int searchMaxIn2DArr(int[][] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int ele = arr[i][j];
                if(ele > max) {
                    max = ele;
                }

            }
        }
        return max;
    }

    static int searchMinIn2DArr(int[][] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int ele = arr[i][j];
                if(ele < min) {
                    min = ele;
                }

            }
        }
        return min;
    }




}
