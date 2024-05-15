package tutorials.recurrsion.patterns;

import java.sql.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,8,9,7,3,4,6,5,0,1,10,12,15,14,17,19,20};

//        System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {

        if(arr.length == 1) {
            return arr;
        }
        int mid  = arr.length/2;

        int[] firstHalf = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] secondHalf = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(firstHalf, secondHalf);

    }

    private static int[] merge(int[] firstHalf, int[] secondHalf) {
        int[] newArray = new int[firstHalf.length + secondHalf.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < firstHalf.length && j < secondHalf.length) {
            if(firstHalf[i] < secondHalf[j]) {
                newArray[k] = firstHalf[i];
                i++;
            }else {
                newArray[k] = secondHalf[j];
                j++;
            }
            k++;

        }

        while(i<firstHalf.length) {
            newArray[k] = firstHalf[i];
            i++;
            k++;
        }

        while(j<secondHalf.length) {
            newArray[k] = secondHalf[j];
            j++;
            k++;
        }

        return newArray;
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {

        if(e-s == 1) {
            return;
        }
        int mid  = (s+e)/2;

         mergeSortInPlace(arr,s, mid);
         mergeSortInPlace(arr, mid, arr.length);
        mergeInPlace(arr, s, mid, e);

    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] newArray = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e) {
            if(arr[i] < arr[j]) {
                newArray[k] = arr[i];
                i++;
            }else {
                newArray[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<mid) {
            newArray[k] = arr[i];
            i++;
            k++;
        }

        while(j<e) {
            newArray[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < newArray.length; l++) {
            arr[s+l] = newArray[l];
        }
    }
}
