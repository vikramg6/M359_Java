package U3.Notes.Gamer;

public class GamerTester {
    public static void main(String[] args) {
        Gamer matthew = new Gamer("Matthew");
        Gamer vikram = new Gamer("Vikram");
        for (int i = 0; i < 10; i++){
            playGame(matthew);
            playGame(vikram);
            if((int)(Math.random() * 2) + 1 == 1) {
                battle(matthew, vikram);
            }
        }
        System.out.println(matthew.toString());
        System.out.println(vikram.toString());
    }
    public static void playGame(Gamer g) {
        int scoreInc = (int)(Math.random() * 15) + 1;
        int total = g.getScore() + scoreInc;
        g.setScore(total);
        g.levelUp();
    }
    public static void battle(Gamer p1, Gamer p2) {
        int winner = (int)(Math.random() * 2) + 1;
        if(winner == 1){
            int win = p1.getScore() + 7;
            p1.setScore(win);
            int loss = p2.getScore() - 5;
            p2.setScore(loss);
        }
        else {
            int win = p2.getScore() + 7;
            p2.setScore(win);
            int loss = p1.getScore() - 5;
            p1.setScore(loss);
        }
        p1.levelUp();
        p2.levelUp();
    }


}
