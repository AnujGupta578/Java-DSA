package tutorials.recurrsion.easy.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Find {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,12,74};
        int[] arr1 = {2,4,5,7,8,12,12,74};
        int[] arr2 = {2,4,5,7,7,8,12,12,7,74};

        System.out.println(find(arr, 12, 0));
        System.out.println(findIndex(arr, 74, 0));
        System.out.println(findIndexLast(arr, 7, arr.length-1));

        findAllIndex(arr1, 12, 0);
        System.out.println(list);

//        findAllIndexByPassList(arr2, 7, 0, list1);
//        System.out.println(findAllIndexByPassList(arr2, 7, 0, new ArrayList<>()));

        System.out.println(findAllIndexNotByPassList(arr2, 7, 0));

    }

    static boolean find(int[]arr, int target, int index){

        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index +1);

    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target ) {
            return index;
        } else {
           return findIndex(arr, target, index +1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index){
        if(index == -1) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index -1);
        }
    }


    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length) {
            return;
        }
        if(arr[index] == target ) {
            list.add(index);
        }
        findAllIndex(arr, target, index +1);
    }

    static ArrayList<Integer> findAllIndexByPassList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target ) {
            list.add(index);
        }
       return findAllIndexByPassList(arr, target, index +1, list);
    }

    static ArrayList<Integer> findAllIndexNotByPassList(int[] arr, int target, int index) {
        ArrayList<Integer> list  = new ArrayList<>();
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target ) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndexNotByPassList(arr, target, index +1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
