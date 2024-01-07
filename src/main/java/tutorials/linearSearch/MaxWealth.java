package tutorials.linearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                { 4, 5, 6},
                { 7, 9 , 10 },
                { 10, 12 , 14 },
                { 70, 95 , 10 }
        };
      int maxWealth =  maxWealthIncome(arr);
        System.out.println(maxWealth);
    }

    static int maxWealthIncome(int[][] accounts) {
        int maxWealth = 0;
        for (int person = 0; person < accounts.length; person++) {
           int sumOfWealth = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sumOfWealth += accounts[person][account];
            }

            if(sumOfWealth > maxWealth) {
                maxWealth = sumOfWealth;
            }
        }

        return maxWealth;
    }
}
