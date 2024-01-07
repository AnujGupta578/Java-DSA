package tutorials.BinarySearch;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3, 1};
        int ans = getPeakValue(arr);

        System.out.println(ans);

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
