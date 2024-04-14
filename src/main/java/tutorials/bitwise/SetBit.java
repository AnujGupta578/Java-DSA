package tutorials.bitwise;

public class SetBit {

    public static void main(String[] args) {
        int n = 17;

        int setDigit = setDigitCount(n);
        System.out.println(setDigit);
        System.out.println(Integer.toBinaryString(n));
    }

    private static int setDigitCount(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n -= (n&(-n));
        }

        return count;
    }
}
