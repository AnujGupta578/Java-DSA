package leetcode;

import java.util.ArrayList;

public class CalcLetterCombination {

    public static void main(String[] args) {
//        calcLetterCombination(" ", "12");
        System.out.println(calcLetterCombinationToList("", "12").size());
        System.out.println(calcLetterCombinationCount("", "12"));

    }

    static void calcLetterCombination(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit  = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {

            char ch = (char) ('a' + i);

            calcLetterCombination(p + ch, up.substring(1));


        }

    }


    static ArrayList<String> calcLetterCombinationToList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit  = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            ans.addAll(calcLetterCombinationToList(p + ch, up.substring(1)));
        }
        return ans;

    }

    static int calcLetterCombinationCount(String p, String up) {
        if(up.isEmpty()) {

            return 1;
        }

        int digit  = up.charAt(0) - '0';

        int count = 0;

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {

            char ch = (char) ('a' + i);

            count = count +  calcLetterCombinationCount(p + ch, up.substring(1));


        }

        return count;

    }


}
