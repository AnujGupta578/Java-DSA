package tutorials.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {2,1,4,2};
        List<Integer> result = getMismatch(arr);
        System.out.println(Arrays.toString(result.toArray()));
    }

    static List<Integer> getMismatch(int[] arr) {

        int i = 0;
        while (i < arr.length) {
                int currentIndex = arr[i] - 1;
                if(arr[i] != arr[currentIndex]) {
                swap(arr, i, currentIndex);
            } else  {
                i++;
            }

        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {

            if(arr[index] != index + 1) {
                ans.add(arr[index]); // value repetitive value
                ans.add(index+ 1); // // missing value
            }

        }
        return ans;
    }

    static void swap(int[] arr, int start, int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
}
