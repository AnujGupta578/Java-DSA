package tutorials.BinarySearch;

public class InfiniteArray {

    public static void main(String[] args) {

        int[] arr = {3,5,6,7,8,9,12,15,16,18,19,20,22,25,28,29,35,39,40,49,50,56,58};
        int target = 21;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
//            no need to check from start index box element.
            start  = end;
//            double the size of box and update end position
            end = end + (end - start + 1) * 2;
        }

        return search(arr, target, start, end);

    }

    static int search(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(target > arr[mid]) {
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
