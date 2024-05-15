package tutorials.recurrsion.backtracking;

import java.util.Arrays;

public class AllPath {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
//        allPath("", maze, 0, 0);
        int[][] path = new int[maze.length][maze[0].length];

        allPathPrint("", maze,0, 0, path, 1 );
    }


    static void allPath(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length -1  && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

//        setting the visited part as false
        maze[r][c] = false;

        if(r < maze.length - 1) {
            allPath(p+ "D", maze, r+1, c);
        }

        if( c < maze[0].length -1 ) {
            allPath(p+ "R", maze,  r, c+1);

        }

        if(r > 0) {
            allPath(p+ "U", maze,  r-1, c);
        }
        if(c > 0) {
            allPath(p+ "L", maze,  r, c-1);
        }

//        this line is where the function will be over
//        so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int steps) {
        if(r == maze.length -1  && c == maze[0].length - 1) {
            for (int[] arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]) {
            return;
        }

//        setting the visited part as false
        maze[r][c] = false;
        path[r][c] = steps;

        if(r < maze.length - 1) {
            allPathPrint(p+ "D", maze, r+1, c, path, steps+1);
        }

        if( c < maze[0].length -1 ) {
            allPathPrint(p+ "R", maze,  r, c+1, path, steps+1);

        }

        if(r > 0) {
            allPathPrint(p+ "U", maze,  r-1, c, path, steps+1);
        }
        if(c > 0) {
            allPathPrint(p+ "L", maze,  r, c-1, path, steps+1);
        }

//        this line is where the function will be over
//        so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0
;    }
}
