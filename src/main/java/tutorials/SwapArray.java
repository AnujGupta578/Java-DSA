package tutorials;

import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {
        int[] arr = {1 , 8, 9, 71, 10 };
//       int[] swappedArr =  swap(arr, 2, 4);

//        System.out.println(Arrays.toString(swappedArr));

        int[] reverseArr =  reverseArr(arr);

        System.out.println(Arrays.toString(reverseArr));
    }


    static int[] reverseArr (int[] arr) {
        int startIn = 0;
        int endIn = arr.length -1;

        while(endIn > startIn) {
            swap(arr, startIn, endIn);
            startIn++;
            endIn--;
        }
        return arr;
    }
    static int[] swap(int[] array, int index1, int index2 ) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
}

