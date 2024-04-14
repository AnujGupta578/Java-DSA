package tutorials.recurrsion.easy;

public class DigitSum {
    public static void main(String[] args) {

        System.out.println(sum(1236));
        System.out.println(prod(123));
    }

    static int sum(int n) {

        if(n == 0) {
            return 0;
        }
        return sum(n/10)+ (n%10);
    }

    static int prod(int n) {

        if(n%10 == n) {
            return n;
        }
        return prod(n/10) * (n%10);
    }
}
