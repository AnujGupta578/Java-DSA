package oop.introduction.comparing;

public class Student {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student student = new Student(12, 89.76f);
        Student student1 = new Student(5, 99.52f);
    }
}
