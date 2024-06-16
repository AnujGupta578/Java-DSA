package oop.introduction.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {

    public static void main(String[] args) {
        ArrayList<Integer> arr  = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);

        arr.forEach(fun);

        Operation add = (a, b) -> a+b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a- b;

        LambdaFunction calc = new LambdaFunction();
        System.out.println(calc.operation(5, 3, add));
        System.out.println(calc.operation(5, 3, prod));
        System.out.println(calc.operation(5, 3, sub));


    }

    private int operation(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface  Operation {
   int operation(int a, int b);
}
