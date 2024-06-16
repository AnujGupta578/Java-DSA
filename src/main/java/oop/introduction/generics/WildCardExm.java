package oop.introduction.generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExm<T extends Number> {
        private Object[] data;
        private static int DEFAULT_SIZE = 10;

        private int size = 0;

        public WildCardExm() {

            this.data = new Object[DEFAULT_SIZE];
        }


//        wildcard example
        public void getList(List<? extends  Number> list) {
//            do something
        }

        public void add(int num) {
            if(isFull()) {
                resize();
            }

            data[size++] = num;
        }

        private void resize() {
            Object[] temp = new Object[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        private boolean isFull() {
            return size == data.length;
        }

        public T remove() {
            T removed = (T)(data[--size]);
            return removed;
        }

        public T get(int index) {

            return (T)(data[index]);
        }

        public int size() {
            return size;
        }

        public void ser(int index, T value) {

            data[index] = value;
        }

        @Override
        public String toString() {
            return "CustomArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        public static void main(String[] args) {

            CustomGenArrayList list = new CustomGenArrayList();
            list.add(3);
            list.add(5);
            list.add(9);

            System.out.println(list);

            CustomGenArrayList<Integer> list1 = new CustomGenArrayList<>();

            for (int i = 1; i < 14; i++) {
                list1.add(i * 2);
            }

            System.out.println(list1);


        }
}