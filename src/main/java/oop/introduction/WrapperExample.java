package oop.introduction;

public class WrapperExample {

    public static void main(String[] args) {

        int a  = 10;
        int b = 20;
        Integer num = 45;

        swap(a, b);
        System.out.println(a + " Hello I am " + b);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " Hello I am " + b);

    }
}
