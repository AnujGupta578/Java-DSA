package assignment;

// [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {

        int[] arr = {0,2,1,5,3,4};

//        int[] newArr = arrayPermutation(arr);
//        System.out.println(Arrays.toString(newArr));

        int[] ans = aPermutation(arr, 0);
        System.out.println(Arrays.toString(ans));
    }

    /**
     *  new array = {}
     * @param arr
     * @return
     */

    static int[] arrayPermutation(int[] arr) {
        int[] permutationArr = new int[arr.length];
        if(arr.length >= 1 && arr.length <= 1000) {
        for (int i = 0; i < arr.length; i++) {
            permutationArr[i] = arr[arr[i]];
        }
        }
        return permutationArr;
    }

    static int[] aPermutation(int[] arr, int start) {

        if(arr.length >= 1 && arr.length <= 1000 && start <arr.length) {
            int temp = arr[start];
            int result = arr[temp];
            aPermutation(arr, start+1);
            arr[start] = result;
        }
       return arr;
    }



}
