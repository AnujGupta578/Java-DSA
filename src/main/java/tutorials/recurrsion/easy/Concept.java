package tutorials.recurrsion.easy;

public class Concept {

    public static void main(String[] args) {
        func(5);
    }

    static void func(int n) {

        if(n == 0) {
            return;
        }

        System.out.println(n);

//        func(n--);  this will never stop hence infinite as the number never get subtracted before passing it recursion.

        func(--n); // this will subtract the number by 1 and pass it to recursion function.
    }
}
