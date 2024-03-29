package tutorials.BinarySearch;

public class RBS {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        int pivot = findPivot(arr);
        System.out.println(pivot);

    }

    static int search(int[] arr, int target) {
//        if we don't find a pivot, it means the array is not rotated
        int pivot = findPivot(arr);

        if(pivot == -1) {
//            just do normal binary search;
            return binarySearch(arr, target, 0, arr.length -1);
        }

        if(arr[pivot] == target) {
            return pivot;
        }

        if(target > arr[0]) {
            return binarySearch(arr, target, 0, pivot -1);
        }

        if(target < arr[0]) {
            return binarySearch(arr, target, pivot+1, arr.length -1);
        }

        return -1;

    }

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) /2;

            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid -1;
            }

            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }

    static int findPivotInDuplicate(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) /2;

            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid -1;
            }

//            if start, mid and end are same, just skip the duplicates elements
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
//                skip the duplicates
//                Note:- what if these elements at start and end were are pivot??
//                check if start is pivot
                if(arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
//                check if end is pivot or not

                if(arr[end] < arr[end-1]) {
                    return end -1;
                }
                end--;
//                left side is sorted so pivot should be at right side
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid+1;
            }else {
                end = mid-1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {

            int mid = start + (end - start)/2 ;

            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else  {
                return mid;
            }
        }

        return  -1;

    }
}
