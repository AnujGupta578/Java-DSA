package tutorials.Maths;

public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; // precision
        System.out.println(sqrtNum(n, p));
        System.out.printf("%.3f", sqrtNum(n, p));
    }

    static double sqrtNum(int n, int p) {
        int start = 0;
        int end = n;

        double root = 0.0;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if(mid * mid == n) {
                return mid;
            }
            if(mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p ; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
