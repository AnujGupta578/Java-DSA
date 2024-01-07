package tutorials.BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 3, 1};
//        int ans = getPeakValue(arr);
        int target = 3;

//        System.out.println(ans);

        int ans = search(arr, target);
        System.out.println(ans);




    }

    static int search(int[] arr, int target) {
        int peak = getPeakValue(arr);

        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }

        int secondTry = orderAgnosticBS(arr, target, peak+1, arr.length-1);
        return secondTry;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAcs = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAcs) {
                if (target < arr[mid]) {
                    end = mid - 1; // move to left
                } else {
                    start = mid + 1; // move to right side
                }
            } else { // target is greater than mid and order is descending
                if (target > arr[mid]) {
                    end = mid - 1; // move to left

                } else {
                    start = mid + 1; // move to right
                }
            }
        }

        return -1;
    }

    static int getPeakValue(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end-start)/2;
            
            if(arr[mid] > arr[mid+1]) {
//                you are in des part of the array
//                it may be the answer so look at the left part of the array
//                so the end would be equal to mid
                end = mid;
            } else {
//                you are in asc part of the array
//                look the right side of the array
//                while moving to right side our start position will be changed and start = mid+1; and ignore left side of the array's element
                start = mid+1;
            }
        }
//        in the end start == end and return the largest number of the array.
        return start;
    }
}
