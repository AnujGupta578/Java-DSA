package assignment;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int[] ans = sumOf1DArr(arr);

        System.out.println(Arrays.toString(ans));
    }

    static int[] sumOf1DArr(int[] arr) {
        int[] copyArr = new int[arr.length];
        if(arr.length >= 1 && arr.length <= 1000) {
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = 0; j <= i; j++) {
                    sum +=arr[j];
                }
//                sum = indexSum(arr, i, sum, 0);
//                int count = i;

//                while (count > -1) {
//                   sum += arr[count];
//                   count--;
//                }
                copyArr[i] = sum;
            }
        }
        return copyArr;
    }

    static int indexSum(int[] arr, int index, int sum, int start) {
        if(start <= index) {
            sum +=arr[start];
            indexSum(arr, index, sum,start+1);

        }
        return sum;
    }


}
