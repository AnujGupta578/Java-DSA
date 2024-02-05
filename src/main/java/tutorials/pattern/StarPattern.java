package tutorials.pattern;

public class StarPattern {

    public static void main(String[] args) {
        System.out.println("------- Pattern 1 ----------");
        patter1(10);
        System.out.println();
        System.out.println("------- Pattern 2 ----------");
        patter2(10);

        System.out.println();
        System.out.println("------- Pattern 3 ----------");
        patter3(10);


        System.out.println();
        System.out.println("------- Pattern 4 ----------");
        patter4(10);

        System.out.println();
        System.out.println("------- Pattern 5 ----------");
        pattern5(10);


        System.out.println();
        System.out.println("------- Pattern 28 diamond ----------");
        pattern28(10);
    }

    static void patter1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patter2(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void patter3(int n) {

//        for (int row = n; row >= 1; row--) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        or

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patter4(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {

        for (int row = 1; row <= 2*n-1; row++) {
            int c = row <=n?row:2*n - row;
            for (int col = 1; col <=c ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    diamond pattern
    static void pattern28(int n) {
        for (int row = 1; row <= 2*n - 1; row++) {
            int noOfCols = row <=n? row : 2*n - row;
//            print first spaces
//            int noOfSpaces = row <= n ? n - row : row - n;
//            or

            int noOfSpaces =n - noOfCols;
            for (int space = 1; space <= noOfSpaces; space++) {
                System.out.print(" ");
            }



            for (int cols = 1; cols <= noOfCols; cols++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}


