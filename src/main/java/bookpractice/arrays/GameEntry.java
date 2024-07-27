package bookpractice.arrays;

public class GameEntry {

    private String name;
    private int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public GameEntry(){

    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
