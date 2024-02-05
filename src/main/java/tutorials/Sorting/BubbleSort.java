package tutorials.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,8,7,3,6,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {

        boolean swapped;

//        run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i ; j++) {
//                swap if the item is smaller than the previous one.

                if(arr[j] < arr[j-1]) { // 5<10 -> j=0 -> 10 & j=1 -> 5 [10, 5] -> j = 1, j-1 = 0
                    int temp = arr[j]; // temp = 5;
                    arr[j] = arr[j-1];  // 5 -> 10
                    arr[j-1] = temp; // 10 -> 5 => [5, 10]
                    swapped = true;
                }
            }
//            if no swapped occur break the loop
            if(!swapped) {
                break;
            }
        }
    }
}
