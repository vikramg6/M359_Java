package U3.Notes.Stadium;

public class TeamStadiumTester {
    public static void main(String[] args) {
        // What are the contents of these objects?
        Stadium soldier = new Stadium("Soldier Field", "Chicago", "IL", 61500);
        Stadium lambeau = new Stadium("Lambeau Field", "Green Bay", "MO", 81441);
        Team bears = new Team("Bears", 7, soldier);
        Team fire = new Team("Fire", 11, soldier);
        // What is the effect of this line of code?
        soldier.setName("Chicago Stadium");
        // What does this code do?
        relocate(bears, lambeau);
        System.out.println(bears.getHome().getCity());
        // What is printed?
        System.out.println(fire);
        System.out.println(bears);
    }
    public static void relocate(Team t, Stadium newHome) {
        t.setHome(newHome);
    }
}
