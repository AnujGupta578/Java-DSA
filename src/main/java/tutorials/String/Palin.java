package tutorials.String;

public class Palin {

    public static void main(String[] args) {

        String str = "abcdcba";

        boolean isPalind = isPalindrom(str);
        System.out.println(isPalind);

    }

    static boolean isPalindrom(String str) {
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length()/2; i++) {
            char start = lowerStr.charAt(i);
            char end = lowerStr.charAt(lowerStr.length() -1-i);
            if(start != end) {
                return false;
            }

        }
        return true;
    }
}
