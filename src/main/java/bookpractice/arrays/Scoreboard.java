package bookpractice.arrays;

import bookpractice.arrays.GameEntry;

public class Scoreboard {
    private int numEntries;
    private GameEntry[] board;

    public Scoreboard(int size) {
        board = new GameEntry[size];
    }

    public void addEntry(GameEntry e) {
        int newScore = e.getScore();

        if(numEntries < board.length || newScore > board[numEntries -1].getScore()) {
            if(numEntries < board.length) {
                numEntries++;
            }
            int j = numEntries -1;
            while(j> 0 && board[j-1].getScore() < newScore) {
                board[j] = board[j-1];
                j--;
            }
            board[j] = e;
        }
    }

    public GameEntry removeEntry(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        GameEntry temp = board[index];
        for (int i = index; i < numEntries - 1; i++) {
            board[i] = board[i+1];
        }
        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }
}
