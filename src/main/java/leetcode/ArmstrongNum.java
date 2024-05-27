package leetcode;

public class ArmstrongNum {

    public static void main(String[] args) {
        armstrongNum(0, 1000);

    }

    public static void armstrongNum(int startNum, int endNum) {

        int i = startNum;
        while (i <= endNum) {
            if(checkArmNum(i)) {
                System.out.print(i + " ");
            }
            i++;
        }

    }

    public static boolean checkArmNum(int num) {
        int pow = 0;
        int temp;
        int sum = 0;

        temp = num;
        while(temp>0) {
            temp/=10;
            pow++;
        }
        temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            temp /=10;
            sum += Math.pow(digit, pow);
        }

        if(sum != num) {
            return false;
        }
        return true;
    }


}
