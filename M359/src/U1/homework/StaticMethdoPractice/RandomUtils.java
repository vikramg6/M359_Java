package U1.homework.StaticMethdoPractice;
import java.lang.Math;
public class RandomUtils {
    // C-1
    public static int rollDie() {
        return (int)(Math.random() * 6) + 1;
    }
    // C-2
    public static int randInt(int first, int last) {
        double multiplier = first - last + 1;
        return (int)(Math.random() * multiplier) + first;

    }
}
