package U3.Notes.Worksheet;

public class Gamer {
    private String name;
    private int score, level;

    public Gamer(String name) {
        this.name = name;
        this.score = 0;
        this.level = 0;
    }
    /*
    Right click, choose generate
    select constructor
    Then if you do it again hit get/set
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
