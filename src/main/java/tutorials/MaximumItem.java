package tutorials;

public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {1,54,78,96,752,987,452,102,202};

        int max = getMax(arr);
        System.out.println(max);

        System.out.println("Range max: " + getMaxRange(arr, 2, 4));

    }

    static int getMaxRange(int[] array, int startIn, int endIn) {
        int max = array[startIn];
        for (int i = 0; i <= endIn; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }

        }
        return max;

    }
}
