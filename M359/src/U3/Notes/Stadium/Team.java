package U3.Notes.Stadium;

public class Team {
    //● Team:
    //○ String variable: name
    //○ int variable: wins
    //○ Stadium variable: home
    //○ Constructor that takes name, wins, and home
    //○ toString that returns a String in this format:
    //■ Bears (7 wins) play at Soldier Field, Chicago, IL (61500 seats)
    //○ get/set methods for all variables
    private String name;
    private int wins;
    private Stadium home;

    public Team(String name, int wins, Stadium home) {
        this.name = name;
        this.wins = wins;
        this.home = home;
    }
    public String toString(){
        return name + "(" + wins + " wins) play at " + home.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public Stadium getHome() {
        return home;
    }

    public void setHome(Stadium home) {
        this.home = home;
    }
}
