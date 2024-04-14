package tutorials.recurrsion;

public class UniqueNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        int unique = findUnique(arr);
        System.out.println(unique);
    }

    private static int findUnique(int[] arr) {

        int unique = 0;

        for (int n: arr ) {
            unique ^= n;
        }

        return unique;
    }
}
