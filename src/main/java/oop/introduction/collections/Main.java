package oop.introduction.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        list.add(2);
        list.add(10);
        list.add(15);

        List<Integer> vector = new Vector<>();

        vector.add(15);
        vector.add(20);
        vector.add(25);


    }
}
