package tutorials.BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,9,14,16,18};
        int target  =15;
        int ans = floorOfNumber(arr, target);
        System.out.println(ans);

    }

    //    assuming array is in ascending mode
    static int floorOfNumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;

//        if target is the smallest number compare to other number in array
        if(target < arr[start]) {
            return -1;
        }

        while (start<= end) {
            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                return arr[mid];
            }

            if (target > arr[mid]) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }

        return arr[end];

    }
}
