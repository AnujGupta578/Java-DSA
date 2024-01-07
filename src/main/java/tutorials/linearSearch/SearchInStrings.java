package tutorials.linearSearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {

        String name = "Anuj";
        char target = 'u';

        System.out.println(search(name, target));

    }

    static boolean search(String name, char target) {
        if(name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    static boolean search2(String name, char target) {
        if(name.length() == 0) {
            return false;
        }

        for (char c: name.toCharArray() ) {
            if(target == c) {
                return true;
            }

        }



        return false;
    }
}
