package U1.homework.StaticMethdoPractice;
import java.lang.Math;

import static java.lang.StrictMath.abs;

public class CalcUtils {
    // B-1
    public static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }
    // B-2
    public static double hypotenuse(double a, double b) {
        double XY = (Math.pow(a, 2) + Math.pow(b, 2));
        return Math.sqrt(XY);
    }
    // B-3a
    public static int absDiff(int x, int y) {

        return 	abs(x) - 	abs(y);
    }
    // B-3b
    public static double absDiff(double x, double y) {

        return 	abs(x) - abs(y);
    }
}

