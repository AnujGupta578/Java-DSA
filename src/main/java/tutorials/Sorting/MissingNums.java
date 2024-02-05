package tutorials.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNums {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

       List<Integer> ans =  missingNumbers(arr);
        System.out.println(Arrays.toString(ans.toArray()));

    }

    static List<Integer> missingNumbers(int[] arr) {
        int i = 0;
        while(i< arr.length) {
            int currentIndex = arr[i]-1;
            if(arr[i] != arr[currentIndex]) { // arr = {1, 2, 3, 5}
                swap(arr, i, currentIndex);
            }else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1) {
                // compare with index if arr start with 0 value at 0 index, if it starts with 1 at 0 index;
                // compare with index + 1
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
