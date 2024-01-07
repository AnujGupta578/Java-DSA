package tutorials.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10, 12, 14, 16, 18, 20};
        int target = 3;
        int index = linearSearch(arr, target);
        System.out.println("Index is: " + index);

        int ele = linearSearch2(arr, target);

        System.out.println("Element is: " +ele);

        boolean isFound = linearSearch3(arr, target);
        System.out.println("is Found: " + isFound);

        int indexRange = searchInRange(arr, 2, 4, target);

        System.out.println("In Range of :" + indexRange);
    }

    static int linearSearch(int[] arr, int target) {

        if(arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int ele = arr[index];
            if(ele == target) {
                return index;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int ele: arr) {
            if(ele == target) {
                return ele;
            }

        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target) {

        if (arr.length == 0) {
            return false;
        }

        for (int ele: arr) {
            if(ele == target) {
                return true;
            }

        }
        return false;
    }

    static int searchInRange(int[] array, int startIndex, int endIndex, int target) {

        if(array.length == 0) {
            return -1;
        }

        for (int i = startIndex; i <= endIndex ; i++) {
            int ele = array[i];
            if(ele == target) {
                return i;
            }
        }

        return -1;

    }
}
