package oop.introduction.access;

public class ObjectDemo {
    int num;

    ObjectDemo(int n) {
        this.num = n;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }
 }
