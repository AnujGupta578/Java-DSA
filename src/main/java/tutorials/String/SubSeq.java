package tutorials.String;

import java.util.ArrayList;

public class SubSeq {

    public static void main(String[] args) {
        //        subseq("", "abc");

        System.out.println(subseqToArray(" ", "abc"));

    }

    static void subseq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ ch, up.substring(1));
        subseq(p, up.substring(1));


    }

    //    add ans into arraylist and return
    static ArrayList<String> subseqToArray(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left  = subseqToArray(p+ ch, up.substring(1));
        ArrayList<String> right  = subseqToArray(p, up.substring(1));
        left.addAll(right);
        return left;


    }
}
