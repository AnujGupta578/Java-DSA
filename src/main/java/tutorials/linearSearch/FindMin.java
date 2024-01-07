package tutorials.linearSearch;

public class FindMin {

    public static void main(String[] args) {

        int[] array = {45,78,68,89,454, -7, 1518,45,69,70,25,78,9};

        int minNum = findMinimumNumber(array);
        System.out.println("Minimum number is: " + minNum);

    }

    static int findMinimumNumber(int[] array) {
        if(array.length == 0) {
            return  -1;
        }
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }

        }
        return min;



    }
}
