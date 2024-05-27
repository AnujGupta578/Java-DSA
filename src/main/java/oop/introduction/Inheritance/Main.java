package oop.introduction.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.w + " " +  box.h);

        BoxWeight box1 = new BoxWeight();
        BoxWeight box2 = new BoxWeight(1, 2, 3, 4);
        System.out.println(box2.weight);
        System.out.println(box2.h);


//        BoxWeight boxWeight = new Box();
//        System.out.println(boxWeight.h); It can't be run
//        at the above initialization Box class does not know what child class containing so it can not give the reference
//        of object to access its child (base) class.
         Box box3 = new BoxWeight();
        System.out.println(box3.l + " " + box3.w + " " + box3.h + " " + box3.weight);
//        in the above line BoxWeight has the access of drived class e.i. parent class.



    }
}
