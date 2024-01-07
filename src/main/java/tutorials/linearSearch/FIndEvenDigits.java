package tutorials.linearSearch;

public class FIndEvenDigits {

    public static void main(String[] args) {
        int[] arr = {1, 1221, 4582, 48484, 12543, 78587514};

        int evenCount = evenDigitsInArray(arr);

        System.out.println("Maximum even number digits in Array: " + evenCount);

    }

    static int evenDigitsInArray(int[] arr) {
        int maxEvenDigits = 0;
        if(arr.length == 0) {
            return -1;
        }
//        for (int i = 0; i < arr.length; i++) {
//            int arrEle = arr[i];
//            if(even(arrEle)) {
//                maxEvenDigits++;
//            }
//        }
//        or

        for (int n: arr) {
            if(even(n)) {
                maxEvenDigits++;
            }
        }
        return maxEvenDigits;

    }

    static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }


    static int digits(int num) {
        if(num < 0) {
            num = num*-1;
        }
        int countDigit =  (int)(Math.log10(num)) + 1;

        return  countDigit;
    }
    static int count(int num) {

        if(num < 0) {
            return num * -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;
        while (num>0) {
            count++;
            num = num/10;

        }
        return count;
    }
}
