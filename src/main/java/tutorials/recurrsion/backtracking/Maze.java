package tutorials.recurrsion.backtracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
//        mazePath("", 3, 3);
//        System.out.println(count(3, 3));

//        System.out.println(mazePathToList("" , 3, 3));

//        mazePathToDiagonal("", 3, 3);

//        System.out.println(mazePathToDiagonalToList("", 3, 3));

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        mazePathRestriction("", maze, 0, 0);
    }

    static int count(int r, int c) {
        if(r == 1 || c == 1) {
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c -1);

        return left + right;

    }

    static void mazePath(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1) {
            mazePath("D" + p, r - 1, c);
        }
        if( c > 1) {
            mazePath("R" + p, r, c-1);
        }

    }

    static ArrayList<String> mazePathToList(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1) {
            list.addAll(mazePathToList("D" + p, r - 1, c));
        }
        if( c > 1) {
            list.addAll(mazePathToList("R" + p, r, c-1));
        }

        return list;

    }

    static void mazePathToDiagonal(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1) {
            mazePathToDiagonal("V" + p, r - 1, c);
        }
        if( c > 1) {
            mazePathToDiagonal("H" + p, r, c-1);
        }

        if(r>1 && c > 1) {
            mazePathToDiagonal("D" + p, r-1, c-1);
        }

    }
    static ArrayList<String> mazePathToDiagonalToList(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1) {
            list.addAll(mazePathToDiagonalToList("V" + p, r - 1, c));
        }
        if( c > 1) {
            list.addAll(mazePathToDiagonalToList("H" + p, r, c-1));
        }

        if(r>1 && c > 1) {
            list.addAll(mazePathToDiagonalToList("D" + p, r-1, c-1));
        }

        return list;

    }

    static void mazePathRestriction(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length -1  && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        if(r < maze.length - 1) {
            mazePathRestriction("D" + p, maze, r+1, c);
        }

        if( c < maze[0].length -1 ) {
            mazePathRestriction("R" + p, maze,  r, c+1);
        }

    }


}
