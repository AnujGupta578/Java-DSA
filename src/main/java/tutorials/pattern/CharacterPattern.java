package tutorials.pattern;

public class CharacterPattern {
    public static void main(String[] args) {
        char c = 'C';
        int rows = 5;
        printCharPattern(c, rows);

    }
    
    static void printCharPattern(char c, int rows) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if(i == j || i+j == rows -1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    
}
