package tutorials.bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 31646;
        int base = 2;
        int ans = (int)(Math.log(n) /Math.log(base) ) + 1;
        System.out.println(ans);
    }
}
