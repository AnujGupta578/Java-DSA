package tutorials.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1 };

        List<Integer> ans = getAllMissingNumber(arr);
        System.out.println(Arrays.toString(ans.toArray()));
    }

    static List<Integer> getAllMissingNumber(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int currentIndex = arr[i] - 1;
            if(arr[i] != arr[currentIndex]) {
                swap(arr, i, currentIndex);
            }else  {
                i++;
            }

        }

//        first way to get the list fo all duplicate values;
        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                duplicates.add(arr[index]);
            }
        }

        return duplicates;
    }

    static void swap(int[]arr , int start, int end) {
        int temp = arr [start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
