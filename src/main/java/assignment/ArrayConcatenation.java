package assignment;

// 2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,1, 5 , 10, 15};
        int copyArrlength = arr.length*2;
        int start = 0;
        int end = arr.length;
        int[] copyArr = new int[copyArrlength];
        System.gc();
        copyArr =  aConcatenation(arr, copyArr, start, end);
        System.out.println(Arrays.toString(copyArr));
    }

    static int[] aConcatenation(int[] arr, int[] copyArr, int start, int end) {
        if(arr.length >= 1 && arr.length <= 1000 && start < arr.length) {
            int temp = arr[start];
            aConcatenation(arr, copyArr, start+1, end+1);
            copyArr[start] = temp;
            copyArr[end] = temp;
        }
        return copyArr;
    }
}
