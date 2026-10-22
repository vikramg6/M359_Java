package U3.Homework.ClassroomWork.VideoGame;

public class VideoGameTester {
    public static void main(String[] args) {

        VideoGame g1 = new VideoGame("Minecraft", "Sandbox", 9);
        VideoGame g2 = new VideoGame("Tetris", "Puzzle");


        g1.play();
        System.out.println(g1.getInfo());
        g1.pause();


        System.out.println(g2.getInfo());
        g2.play();
        g2.changeRating(8);
        System.out.println("Updated: " + g2.getInfo());
    }
}
