package tutorials.String;

public class Comparison {

    public static void main(String[] args) {
        String a = "Anuj";
        String b = "Anuj";

        System.out.println(a==b); // return true

        String name = new String("Anuj");
        String name1 = new String("Anuj");

        System.out.println(name == name1); // return false
    }
}
