package U1.homework.firstLab;

public class distance {
    public static void main(String[] args) {
        distance(3, 5, 2,7 );
    }

    public static void distance(int x1, int y1, int x2, int y2) {
        double distanceBetween = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distanceBetween);
    }

}
