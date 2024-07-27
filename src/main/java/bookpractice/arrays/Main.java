package bookpractice.arrays;

public class Main {

    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard(10);
        scoreboard.addEntry(new GameEntry("Anu", 510));

        scoreboard.addEntry(new GameEntry("Anu1", 590));
        scoreboard.addEntry(new GameEntry("Anu2", 660));
        scoreboard.addEntry(new GameEntry("Anu3", 720));
        scoreboard.addEntry(new GameEntry("Anu4", 750));
        scoreboard.addEntry(new GameEntry("Anu5", 1105));

        scoreboard.addEntry(new GameEntry("Anu6", 509));

        GameEntry gameEntry = scoreboard.removeEntry(3);
        System.out.println(gameEntry);

    }
}
