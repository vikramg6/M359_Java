package U1.homework.StaticMethdoPractice;
import java.lang.Math;
public class StaticMethodTester {
    public static void main(String[] args) {
        System.out.println(CalcUtils.areaOfCircle(5));
        System.out.println(CalcUtils.hypotenuse(3, 4));
        System.out.println(CalcUtils.absDiff(10, 3));
        System.out.println(CalcUtils.absDiff(2.5, 10.5));

        System.out.println(RandomUtils.rollDie());
        System.out.println(RandomUtils.randInt(-3, 3));

    }
}
