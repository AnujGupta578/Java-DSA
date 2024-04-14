package tutorials.bitwise;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] arr= new int[][] {
                {1, 1, 0},
                {0, 1, 0},
                {0, 1, 1}
        };

        int[][] ans = flipAndInvertImage(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row: image ) {

//            reverse the array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
//                swap
                int temp = row[i] ^1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }



        return image;
    }
}
