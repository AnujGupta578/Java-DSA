package tutorials.Sorting;

import java.util.Arrays;

public class DuplicateValue {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

       int duplicate =   duplicateEntry(arr);

        System.out.println(duplicate);

    }

    static int duplicateEntry(int[] arr) {
        int i = 0;
// if range is 1, n then 1st index will have value 1 -> index + 1 => 0+1 -> 1
        while (i < arr.length) {
            if(arr[i] != i+1) {
                int currentIndex = arr[i] - 1;
                if(arr[i] != arr[currentIndex]) {
                    swap(arr, i, currentIndex);
                }else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }

        return  -1;
    }

    static void swap(int[] arr, int start, int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
}
