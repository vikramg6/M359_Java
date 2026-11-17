package U3.Notes.Gamer;

public class Gamer {
    private String name;
    private int score, level;

    public Gamer(String name) {
        this.name = name;
        this.score = 0;
        this.level = 1;
    }
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
    public void levelUp(){
        if(score >= 20 + (level * 20)){
            level += 1;
        }
    }
    public String toString(){
        return name + " Score: " + score + " Level: " + level;
    }
}
