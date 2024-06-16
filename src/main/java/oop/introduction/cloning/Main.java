package oop.introduction.cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human a = new Human(30, "Hello");
        Human b = new Human(30, "World!");

         Human c = (Human)a.clone();
        c.arr[0] = 100;

        System.out.println(Arrays.toString(a.arr));
        System.out.println(Arrays.toString(c.arr));
    }
}
