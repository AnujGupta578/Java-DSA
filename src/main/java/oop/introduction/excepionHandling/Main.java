package oop.introduction.excepionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;


        try {
            divide(a, b);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("It will run at the end");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
