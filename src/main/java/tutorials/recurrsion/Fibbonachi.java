package tutorials.recurrsion;

public class Fibbonachi {

    public static void main(String[] args) {
//        int ans = fibo(5);
//        System.out.print(ans);

        int num = 10;

        for (int i = 0; i <num ; i++) {
           int ans = fibboFormula(i);

            System.out.println(ans);
        }
    }

    static int fibboFormula(int n) {

        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n)/Math.sqrt(5));

    }

//    nth fibbonachi number
    static int fibo(int n) {
        if(n< 2) {
            System.out.print(n+ " ");
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
