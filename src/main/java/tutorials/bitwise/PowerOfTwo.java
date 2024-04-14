package tutorials.bitwise;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        boolean isPowerOf2 = n == 0? false : (n & (n-1)) == 0;
        System.out.println(isPowerOf2);
    }
}
