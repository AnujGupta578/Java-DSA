package tutorials.Sorting;

public class FirstMissingPositiveNum {

    public static void main(String[] args) {

    }

    static int missingNumber(int[] arr) {

        int i=0;
        while(i< arr.length) {
            int currentIndex = arr[i] -1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[currentIndex]) {
                swap(arr, i, currentIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return index + 1;

            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}
