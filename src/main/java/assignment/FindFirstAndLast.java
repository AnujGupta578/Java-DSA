package assignment;

import java.util.Arrays;

public class FindFirstAndLast {

    public static void main (String [] args) {

        int[] nums = {5, 7, 7, 8 , 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

//    find the first and last index of the target element in the array.
    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};

//        check the first occurrence
        int start  = searchIndex(arr, target, true);
        int end = searchIndex(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

//    this function will return the index of the search element target.
    static int searchIndex(int[] nums, int target, boolean isStartIndex) {
        int ans = -1;

        int start = 0;
        int end = nums.length -1;

        while (start<=end) {
            int mid = start + (end - start)/2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid +1;
            } else {
                ans = mid;
                if(isStartIndex) {
                    end = mid - 1;
                } else  {
                    start  = mid+1;
                }
            }
        }
        return ans;

    }
}
