package assignment;

//https://leetcode.com/problems/richest-customer-wealth/

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1},
                {3,8,1},
        };

       int max =  maxWealth(accounts);
        System.out.println(max);

    }

    static int maxWealth(int[][] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr.length >= 1 &&  arr[i].length <= 50) {
                    if(arr[i][j] >=1 && arr[i][j] <=100) {
                        sum +=arr[i][j];
                        if(sum>max) {
                            max = sum;
                        }
                    }

                }
            }
        }
        return max;
    }
}
