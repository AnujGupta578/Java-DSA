package tutorials.BinarySearch;

public class MaxOfSplitArray {

    public static void main(String[] args) {

    }

    static int splitArray(int[] nums, int n) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max value from the array.
            end += nums[i];

        }


//        binary search
        while (start<end) {
//            try for the middle as potential ans.
            int mid = start + (end-start)/2;

//            calculate how many pieces you can divide this in with this max sum
            int sum  = 0;
            int pieces = 1;

            for (int num : nums) {
                if(sum + num > mid) {
//                    you can not add this in this subArray, make a new one.
//                    say you add this num in new subArray , then sum = num

                    sum  = num;
                    pieces++;

                } else {
                    start += num;
                }

                if(pieces > n) {
                    start = mid +1;

                } else {
                    end = mid;
                }
                
            }

        }

        return end;
    }
}
