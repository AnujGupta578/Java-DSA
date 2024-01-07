package tutorials.BinarySearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {

        int[] arrAsc = {10, 20, 30, 35, 40, 45, 50, 55};
        int[] arrDsc = {55, 50, 45, 40, 35, 30, 20, 10};

        int target = 50;

        int ansAsc = orderAgnosticBS(arrAsc, target);
        int ansDsc = orderAgnosticBS(arrDsc, target);
        System.out.println("Ascending ans: " + ansAsc + " Descending ans: " + ansDsc);

    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;

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
}
