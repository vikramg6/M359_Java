package U3.Homework.ClassroomWork.VideoGame;

public class VideoGame {
    private String game;
    private String type;
    private int rating;

    public VideoGame(String game, String type, int rating) {
        this.game = game;
        this.type = type;
        this.rating = rating;
    }

    public VideoGame(String game, String type) {
        this.game = game;
        this.type = type;
        this.rating = 5;
    }

    public void play() {
        System.out.println("Now playing: "+game);
    }

    public String getInfo() {
        return "Game: "+game + " | Genre: " + type + " | Rating: " + rating + "/10";
    }

    public void pause() {
        System.out.println(game + " has been paused.");
    }

    public void changeRating(int r) {
        this.rating = r;
    }
}
