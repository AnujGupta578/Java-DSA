package tutorials.Sorting;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1,0,3,2};
        int missingNum = missingNumber(arr);
        System.out.println(missingNum);
    }

    static int missingNumber(int[] arr) {

        int i=0;
        while(i< arr.length) {
            int currentIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[currentIndex]) {
                swap(arr, i, currentIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;

            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

}


