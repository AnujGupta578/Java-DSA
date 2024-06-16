package oop.introduction.cloning;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};

    }


//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    @Override
    public Object clone() throws CloneNotSupportedException {
       Human human = (Human)super.clone(); // this is a shallow copy

//        make a deep copy

        human.arr = new int[human.arr.length];
        for (int i = 0; i < human.arr.length; i++) {
            human.arr[i] = this.arr[i];
        }
        return human;
    }

}
