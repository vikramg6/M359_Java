package U1.homework.firstLab;

public class rollDice {
    public static void main(String[] args) {
        rollDice(10);
    }
    public static void rollDice(int sides) {
        int rolled = (int)(Math.random()* sides) + 1;
        System.out.println("The " + sides + " sided die rolled " + rolled);

    }

}
