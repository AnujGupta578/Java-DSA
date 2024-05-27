package oop.introduction.Inheritance;

public class BoxWeight extends Box {
    double weight;

   public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
       super(h, l , w);
        System.out.println(super.weight);
        this.weight = weight;

    }

    BoxWeight(BoxWeight other) {
        super(other);
//        this.l = other.l;
//        this.w = other.w;
//        this.h = other.h;
    }

    BoxWeight(double side) {
        super(side);
    }
}
